package yc;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f61630a;

    /* renamed from: b  reason: collision with root package name */
    public final int f61631b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f61632c;

    /* renamed from: d  reason: collision with root package name */
    public final ha.a f61633d;

    public d(List<String> list, int i10, boolean z10, ha.a aVar) {
        p.h(list, "generationList");
        p.h(aVar, "statusState");
        this.f61630a = list;
        this.f61631b = i10;
        this.f61632c = z10;
        this.f61633d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d b(d dVar, List list, int i10, boolean z10, ha.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = dVar.f61630a;
        }
        if ((i11 & 2) != 0) {
            i10 = dVar.f61631b;
        }
        if ((i11 & 4) != 0) {
            z10 = dVar.f61632c;
        }
        if ((i11 & 8) != 0) {
            aVar = dVar.f61633d;
        }
        return dVar.a(list, i10, z10, aVar);
    }

    public final d a(List<String> list, int i10, boolean z10, ha.a aVar) {
        p.h(list, "generationList");
        p.h(aVar, "statusState");
        return new d(list, i10, z10, aVar);
    }

    public final List<String> c() {
        return this.f61630a;
    }

    public final boolean d() {
        return this.f61632c;
    }

    public final int e() {
        return this.f61631b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return p.c(this.f61630a, dVar.f61630a) && this.f61631b == dVar.f61631b && this.f61632c == dVar.f61632c && p.c(this.f61633d, dVar.f61633d);
        }
        return false;
    }

    public final ha.a f() {
        return this.f61633d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f61630a.hashCode() * 31) + Integer.hashCode(this.f61631b)) * 31;
        boolean z10 = this.f61632c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + this.f61633d.hashCode();
    }

    public String toString() {
        return "ChatConfirmationGenerationPickerBindModel(generationList=" + this.f61630a + ", selectedGenerationIndex=" + this.f61631b + ", registerButtonEnabled=" + this.f61632c + ", statusState=" + this.f61633d + ')';
    }
}
