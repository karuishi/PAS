from memoria_s import MemoriaS


class HD(MemoriaS):
    def __init__(self, new_numero_serie, new_total, new_unidade):
        super().__init__(new_total, new_unidade)
        self.__numero_serie = new_numero_serie

    def get_perda(self):
        return self._get_converte_kb(self._total) / 10240.0 / 100.0b

    def get_espaco_disponivel_real_kb(self):
        return self._get_espaco_disponivel_kb() * (1 - self.get_perda())

    def get_numero_serie(self):
        return self.__numero_serie

    def __str__(self):
        return f"HD Número de Serie {self.__numero_serie} " + super().__str__()
