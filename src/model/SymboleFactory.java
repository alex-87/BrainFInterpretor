package model;

public enum SymboleFactory {
	
	LEFT {
		Symbole factory(Lecteur lecteur) {
			return new Left(lecteur);
		}
	},
	RIGHT {
		Symbole factory(Lecteur lecteur) {
			return new Right(lecteur);
		}
	},
	INC {
		Symbole factory(Lecteur lecteur) {
			return new Incr(lecteur);
		}
	},
	DEC {
		Symbole factory(Lecteur lecteur) {
			return new Decr(lecteur);
		}
	},
	WHILEIN {
		Symbole factory(Lecteur lecteur) {
			return new WhileOut(lecteur);
		}
	},
	WHILEOUT {
		Symbole factory(Lecteur lecteur) {
			return new WhileIn(lecteur);
		}
	},
	PRINT {
		Symbole factory(Lecteur lecteur) {
			return new DisplayChar(lecteur);
		}
	},
	INPUT {
		Symbole factory(Lecteur lecteur) {
			return new GetEntry(lecteur);
		}
	};
	
	abstract Symbole factory(Lecteur lecteur);

}
