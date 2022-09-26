public class CafeSimples implements Cafe {
    @Override
    public Double informarPreco() {
        return (double) 1;
    }

    @Override
    public String informarIngredientes() {
        return "Café";
    }
}
