package so;

/* loaded from: classes4.dex */
public class f {
    public static final <T> void a(Appendable appendable, T t10, io.l<? super T, ? extends CharSequence> lVar) {
        jo.p.h(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.invoke(t10));
            return;
        }
        if (t10 == null ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(String.valueOf(t10));
        }
    }
}
