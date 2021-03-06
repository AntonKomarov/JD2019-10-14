package by.it.komarov.jd01_07;

class Vector extends Var {
    private double[] value;

    Vector(double[] value) { this.value = value; }

    Vector(Vector vector)  { this.value = vector.value; }

    Vector(String strValue){
        String[] str = strValue.replace('{', ' ').replace('}', ' ').trim().split(",\\s*");
        value = new double[str.length];
        for (int i = 0; i < value.length; i++) {
            value[i] = Double.parseDouble(str[i]);
        }
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder("{");
        String delimiter = "";

        for (double element : value) {
            sb.append(delimiter).append(element);
            delimiter = ", ";
        }
        sb.append("}");
        return sb.toString();
    }
}
