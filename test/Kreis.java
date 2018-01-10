class Kreis extends Figur implements Flaeche {
  private double r;

  public Kreis(double r) {
    this.r = r;
  }

  public double getFlaeche() {
    return Math.PI * r * r;
  }
}
