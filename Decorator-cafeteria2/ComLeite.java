public class ComLeite extends CafeDecorator {
   public ComLeite(Cafe cafe) {
    super(cafe);
   } 

   @Override
   public Double informarPreco() {
    return super.informarPreco() + 0.5;
   }

   @Override
   public String informarIngredientes() {
    return super.informarIngredientes() + "com leite";
   }
}
