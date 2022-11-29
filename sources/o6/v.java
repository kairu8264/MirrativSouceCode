package o6;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f44121a = new v();

    /* renamed from: b  reason: collision with root package name */
    public static io.a<Long> f44122b = a.F;

    /* loaded from: classes.dex */
    public /* synthetic */ class a extends jo.m implements io.a<Long> {
        public static final a F = new a();

        public a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // io.a
        /* renamed from: i */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public final long a() {
        return f44122b.invoke().longValue();
    }
}
