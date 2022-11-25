package version1;

public abstract class MenuComponent {

    // так как одни методы имеют смысл только для menuItems, а другие только для Menu, поэтому используем
    // UnsupportedOperationException, чтобы если объект не поддерживает операцию, то ему не нужно было ничего делать
    // поскольку он будет использовать реализацию по умолчанию

    // группа для удаления, добавления, получение MenuComponent
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

}
