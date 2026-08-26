from memoria_s import MemoriaS
from hd import HD
from cd import CD

hd = HD("46327", 10, MemoriaS.MB)
cd = CD(650, MemoriaS.MB)

# a)
print(f"a) Número de Série: {hd.get_numero_serie()} | Perda: {hd.get_perda()}%")

# b)
print(f"b) Estado do CD: {cd.get_estado()}")

# c)
print("\nc) Métodos polimórficos:")
print("   - get_perda()")
print("   - get_espaco_disponivel_real_kb()")
print("   - grava_kb() (sobrescrito em CD)")
print("   - __str__() (sobrescrito em HD e CD)")

print(f"\nPolimorfismo com __str__():")
print(hd)
print(cd)

print(f"\nGravando 100KB no CD: {cd.grava_kb(100)}")
print(f"Estado do CD após gravação: {cd.get_estado()}")
print(f"Tentando gravar novamente: {cd.grava_kb(50)}")
print(cd)
