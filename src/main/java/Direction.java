public enum Direction {
    E() {
        @Override
        public Direction left() {
            return N;
        }

        @Override
        public Direction right() {
            return S;
        }

        @Override
        public Offest forwardOffset() {
            return new Offest(1, 0);
        }

        @Override
        public Offest backwardOffset() {
            return new Offest(-1, 0);
        }
    }, W() {
        @Override
        public Direction left() {
            return S;
        }

        @Override
        public Direction right() {
            return N;
        }

        @Override
        public Offest forwardOffset() {
            return new Offest(-1, 0);
        }

        @Override
        public Offest backwardOffset() {
            return new Offest(1, 0);
        }
    }, S {
        @Override
        public Direction left() {
            return E;
        }

        @Override
        public Direction right() {
            return W;
        }

        @Override
        public Offest forwardOffset() {
            return new Offest(0, -1);
        }

        @Override
        public Offest backwardOffset() {
            return new Offest(0, 1);
        }
    }, N {
        @Override
        public Direction left() {
            return W;
        }

        @Override
        public Direction right() {
            return E;
        }

        @Override
        public Offest forwardOffset() {
            return new Offest(0, 1);
        }

        @Override
        public Offest backwardOffset() {
            return new Offest(0, -1);
        }
    };

    public abstract Direction left();

    public abstract Direction right();

    public abstract Offest forwardOffset();

    public abstract Offest backwardOffset();
}
