package com.chess.board;

import com.chess.messages.spec.Color;

import java.util.Objects;

public class Rook implements Piece {

    private Color color;

    public Rook(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public boolean canMove(Position start, Position end) {
        return checkXOrYMaintained(start, end);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rook rook = (Rook) o;
        return color == rook.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    private boolean checkXOrYMaintained(Position start, Position end){
        return (start.getX()==end.getX()) || (start.getY() == end.getY());
    }
}
