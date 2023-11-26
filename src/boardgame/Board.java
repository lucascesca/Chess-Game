package boardgame;

import java.util.List;

public class Board {
    private Integer rows;
    private Integer columns;
    private Piece[][] pieces;

    public Board(Integer rows, Integer columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Piece piece(int row, int column) {
        return pieces[0][0];
    }

    public Piece piece(Position position) {
        return pieces[0][0];
    }

    public void place(Piece piece, Position position) {

    }

    public Piece removePiece(Position position) {
        return pieces[0][0];
    }

    public boolean positionExists(Position position) {
        return false;
    }

    public boolean thereIsAPiece(Position position) {
        return false;
    }
}
