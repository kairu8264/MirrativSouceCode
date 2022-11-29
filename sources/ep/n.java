package ep;

import java.util.List;

/* loaded from: classes4.dex */
public interface n {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30983b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final n f30982a = new a.C0311a();

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: ep.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0311a implements n {
            @Override // ep.n
            public List<m> loadForRequest(v vVar) {
                jo.p.h(vVar, "url");
                return xn.s.k();
            }

            @Override // ep.n
            public void saveFromResponse(v vVar, List<m> list) {
                jo.p.h(vVar, "url");
                jo.p.h(list, "cookies");
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    List<m> loadForRequest(v vVar);

    void saveFromResponse(v vVar, List<m> list);
}
