class Eredmenyek:
    nev:str
    kategoria:str
    rajtszam:int
    idoeredmeny: str
    tavSzazalek: int
    def __init__(self, sor: str) -> None:
            adatok=sor.split(';')
            self.nev=adatok[0]
            self.rajtszam=int(adatok[1])
            self.kategoria=adatok[2]
            self.idoeredmeny=adatok[3]
            self.tavSzazalek=int(adatok[4])
file = open("ub2017egyeni.txt","r")
