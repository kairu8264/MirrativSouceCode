package e8;

/* loaded from: classes.dex */
public interface e {

    /* loaded from: classes.dex */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        a(boolean z10) {
            this.isComplete = z10;
        }

        public boolean a() {
            return this.isComplete;
        }
    }

    boolean a();

    boolean b(d dVar);

    boolean c(d dVar);

    void d(d dVar);

    void f(d dVar);

    e getRoot();

    boolean j(d dVar);
}
