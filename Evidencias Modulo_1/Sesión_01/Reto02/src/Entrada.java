//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Un record es una forma concisa de definir una clase inmutable en Java.
public record Entrada(String evento, double precio) {
    @Override
    public String toString() {
        return String.format("Evento: %s | Precio: $%.1f", evento, precio);
    }
}
