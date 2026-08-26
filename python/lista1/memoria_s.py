from abc import ABC, abstractmethod

class MemoriaS(ABC):
    BYTE = 0
    KB = 1
    MB = 2
    GB = 3

    def __init__(self, new_total, new_unidade=None):
        if new_unidade is None:
            new_unidade = MemoriaS.KB
        self._total = new_total
        self._unidade = new_unidade
        self._utilizado_kb = 0

    @abstractmethod
    def get_perda(self):
        pass

    @abstractmethod
    def get_espaco_disponivel_real_kb(self):
        pass

    def _get_espaco_disponivel_kb(self):
        return self._get_converte_kb(self._total) - self._utilizado_kb

    def grava_kb(self, new_tamanho):
        if self.get_espaco_disponivel_real_kb() >= new_tamanho:
            self._utilizado_kb += new_tamanho
            return True
        return False

    def _get_converte_kb(self, valor):
        if self._unidade == MemoriaS.BYTE:
            return valor / 1024.0
        elif self._unidade == MemoriaS.KB:
            return valor
        elif self._unidade == MemoriaS.MB:
            return valor * 1024.0
        elif self._unidade == MemoriaS.GB:
            return valor * 1024.0 * 1024.0
        return valor

    def get_unidade(self):
        nomes = {MemoriaS.BYTE: "BYTE", MemoriaS.KB: "KB",
                 MemoriaS.MB: "MB", MemoriaS.GB: "GB"}
        return nomes.get(self._unidade, "DESCONHECIDA")

    def get_percentual_disponivel(self):
        total_kb = self._get_converte_kb(self._total)
        if total_kb == 0:
            return 0
        return (self.get_espaco_disponivel_real_kb() / total_kb) * 100

    def __str__(self):
        return (f"Percentual Disponível {self.get_percentual_disponivel()}% "
                f"Espaço Total {self._get_converte_kb(self._total)}KB "
                f"Espaço Disponível Real {self.get_espaco_disponivel_real_kb()}KB "
                f"Perda {self.get_perda()}%")
