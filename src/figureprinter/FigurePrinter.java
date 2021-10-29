package figureprinter;

public class FigurePrinter {

    public static void main(String[] args) {
        FigurePainter.drawLeftUpTriangle(4);
        FigurePainter.drawRightUpTriangle(5);
        FigurePainter.drawLeftBottomTriangle(5);
        FigurePainter.drawRightBottomTriangle(5);
        FigurePainter.drawRhombus(5);
        FigurePainter.drawIsoscelesTriangle(5);
        System.out.println();
        FigurePainter.drawBottomIsoscelesTriangle(5);
    }
}