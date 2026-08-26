from memoria_s import MemoriaS

class CD(MemoriaS):
    ABERTO = 0
    FECHADO = 1

    def __init__(self, new_total, new_unidade):
        super().__init__(new_total, new_unidade)
        self.__estado = CD.ABERTO

    def get_perda(self):
        return 0.98

    def get_espaco_disponivel_real_kb(self):
        return self._get_espaco_disponivel_kb() * self.get_perda()

    def grava_kb(self, new_tamanho):
        if self.__estado == CD.ABERTO:
            gravou = super().grava_kb(new_tamanho)
            if gravou:
                self.__estado = CD.FECHADO
            return gravou
        return False

    def get_estado(self):
        if self.__estado == CD.ABERTO:
            return "ABERTO"
        return "FECHADO"

    def __str__(self):
        return f"CD Estado {self.get_estado()} " + super().__str__()
