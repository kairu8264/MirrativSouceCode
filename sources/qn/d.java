package qn;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.p;
import jo.q;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f49617a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final p<h, i, Integer> f49618b = c.f49623w;

    /* renamed from: c  reason: collision with root package name */
    public static final p<h, i, Integer> f49619c = a.f49621w;

    /* renamed from: d  reason: collision with root package name */
    public static final p<h, i, Integer> f49620d = b.f49622w;

    /* loaded from: classes4.dex */
    public static final class a extends q implements p<h, i, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f49621w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Integer invoke(h hVar, i iVar) {
            jo.p.h(hVar, TtmlNode.TAG_LAYOUT);
            jo.p.h(iVar, "item");
            return Integer.valueOf(hVar.g() + (((hVar.f() - hVar.g()) - iVar.c()) / 2));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends q implements p<h, i, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f49622w = new b();

        public b() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Integer invoke(h hVar, i iVar) {
            jo.p.h(hVar, TtmlNode.TAG_LAYOUT);
            jo.p.h(iVar, "item");
            return Integer.valueOf(hVar.f() - iVar.c());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends q implements p<h, i, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f49623w = new c();

        public c() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Integer invoke(h hVar, i iVar) {
            jo.p.h(hVar, TtmlNode.TAG_LAYOUT);
            jo.p.h(iVar, "$noName_1");
            return Integer.valueOf(hVar.g());
        }
    }

    public final p<h, i, Integer> a() {
        return f49619c;
    }

    public final p<h, i, Integer> b() {
        return f49618b;
    }
}
