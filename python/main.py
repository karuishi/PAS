from Login import Login
from LoginEspecial import LoginEspecial

def main():
    usuario = Login("eduardo", "123")
    print(usuario.getNome(), usuario.getSenha())
    # a)
    print(usuario.verificaLogin("carlos", "123"))
    
    #c)
    user: Login = LoginEspecial("eduardo", "123")
    print(user.getDica())
    
if __name__ == "__main__":
    main()