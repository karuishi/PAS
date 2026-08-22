from python.exercicios.Login import Login

class LoginEspecial(Login): # b)
    def __init__(self, nome, senha):
        super().__init__(nome, senha)
        self.__dica = "Bobo"
        
    def getDica(self):
        return self.__dica
        