package behavioralPatterns.visitor.shapes;

import behavioralPatterns.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
