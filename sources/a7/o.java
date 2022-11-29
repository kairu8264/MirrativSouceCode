package a7;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class o implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f612a;

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f613b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f614c;

    public o(String str, List<c> list, boolean z10) {
        this.f612a = str;
        this.f613b = list;
        this.f614c = z10;
    }

    @Override // a7.c
    public u6.c a(s6.f fVar, b7.b bVar) {
        return new u6.d(fVar, bVar, this);
    }

    public List<c> b() {
        return this.f613b;
    }

    public String c() {
        return this.f612a;
    }

    public boolean d() {
        return this.f614c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f612a + "' Shapes: " + Arrays.toString(this.f613b.toArray()) + '}';
    }
}
