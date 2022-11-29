package k5;

/* loaded from: classes.dex */
public abstract class i {

    /* loaded from: classes.dex */
    public class a extends i {
        @Override // k5.i
        public h a(String str) {
            return null;
        }
    }

    public static i c() {
        return new a();
    }

    public abstract h a(String str);

    public final h b(String str) {
        h a10 = a(str);
        return a10 == null ? h.a(str) : a10;
    }
}
