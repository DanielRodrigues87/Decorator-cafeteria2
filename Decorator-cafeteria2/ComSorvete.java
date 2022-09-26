public class ComSorvete extends CafeDecorator {
   public ComSorvete(Cafe cafe) {
    super(cafe);
   } 

   @Override
   public Double informarPreco() {
    return super.informarPreco() + 7.0;
   }

   @Override
   public String informarIngredientes() {
    return super.informarIngredientes() + "Sorvete de chocolate";
   }
}
