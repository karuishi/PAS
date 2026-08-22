class Login:
    def __init__(self, nome, senha):
        self.__nome = nome # protected 
        self.__senha = senha # protected
        
    def getNome(self):
        return self.__nome
    
    def getSenha(self):
        return self.__senha
    
    def verificaLogin(self, nome, senha):
        return True if (self.__nome == self.__nome) and (self.__senha == self.__senha) else False