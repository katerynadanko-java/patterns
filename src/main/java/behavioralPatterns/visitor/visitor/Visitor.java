package behavioralPatterns.visitor.visitor;

import behavioralPatterns.visitor.shapes.Circle;
import behavioralPatterns.visitor.shapes.CompoundShape;
import behavioralPatterns.visitor.shapes.Dot;
import behavioralPatterns.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
