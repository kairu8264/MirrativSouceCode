package l0;

/* loaded from: classes.dex */
public final class n1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final i f39209a;

    public /* synthetic */ n1(i iVar) {
        this.f39209a = iVar;
    }

    public static final /* synthetic */ n1 a(i iVar) {
        return new n1(iVar);
    }

    public static <T> i b(i iVar) {
        jo.p.h(iVar, "composer");
        return iVar;
    }

    public static boolean c(i iVar, Object obj) {
        return (obj instanceof n1) && jo.p.c(iVar, ((n1) obj).f());
    }

    public static int d(i iVar) {
        return iVar.hashCode();
    }

    public static String e(i iVar) {
        return "SkippableUpdater(composer=" + iVar + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f39209a, obj);
    }

    public final /* synthetic */ i f() {
        return this.f39209a;
    }

    public int hashCode() {
        return d(this.f39209a);
    }

    public String toString() {
        return e(this.f39209a);
    }
}
