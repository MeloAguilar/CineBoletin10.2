package Enums;

public enum RecomendacionEdad {
    GRADO0(0), GRADO1(7), GRADO2(12), GRADO3(16), GRADO4(18);

    private int edad;
    RecomendacionEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}
