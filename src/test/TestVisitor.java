import noobsofjava.flexichess.Bishop;
import noobsofjava.flexichess.ChessPieceVisitor;
import noobsofjava.flexichess.King;
import noobsofjava.flexichess.Knight;
import noobsofjava.flexichess.Pawn;
import noobsofjava.flexichess.Queen;
import noobsofjava.flexichess.Rook;

public class TestVisitor implements ChessPieceVisitor<Integer> {

	@Override
	public Integer visit(Bishop bishop) {
		return 1;
	}

	@Override
	public Integer visit(King king) {
		return 2;
	}

	@Override
	public Integer visit(Knight knight) {
		return 3;
	}

	@Override
	public Integer visit(Pawn pawn) {
		return 4;
	}

	@Override
	public Integer visit(Queen queen) {
		return 5;
	}

	@Override
	public Integer visit(Rook queen) {
		return 6;
	}	
}