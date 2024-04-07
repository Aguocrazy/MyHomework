class Product {
    private String part1;
    private String part2;
    public void setPart1(String part1) {
        this.part1 = part1;
    }
    public void setPart2(String part2) {
        this.part2 = part2;
    }
}
interface Builder {
    void buildPart1();
    void buildPart2();
    Product getProduct();
}
class ConcreteBuilder implements Builder {
    private Product product = new Product();
    @Override
    public void buildPart1() {
        product.setPart1("Part1");
    }
    @Override
    public void buildPart2() {
        product.setPart2("Part2");
    }
    @Override
    public Product getProduct() {
        return product;
    }
}
class Director {
    public void construct(Builder builder) {
        builder.buildPart1();
        builder.buildPart2();
    }
}
