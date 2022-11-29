package u2;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d  reason: collision with root package name */
    public p f54306d;

    /* renamed from: f  reason: collision with root package name */
    public int f54308f;

    /* renamed from: g  reason: collision with root package name */
    public int f54309g;

    /* renamed from: a  reason: collision with root package name */
    public d f54303a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f54304b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f54305c = false;

    /* renamed from: e  reason: collision with root package name */
    public a f54307e = a.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    public int f54310h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f54311i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f54312j = false;

    /* renamed from: k  reason: collision with root package name */
    public List<d> f54313k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List<f> f54314l = new ArrayList();

    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f54306d = pVar;
    }

    @Override // u2.d
    public void a(d dVar) {
        for (f fVar : this.f54314l) {
            if (!fVar.f54312j) {
                return;
            }
        }
        this.f54305c = true;
        d dVar2 = this.f54303a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f54304b) {
            this.f54306d.a(this);
            return;
        }
        f fVar2 = null;
        int i10 = 0;
        for (f fVar3 : this.f54314l) {
            if (!(fVar3 instanceof g)) {
                i10++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i10 == 1 && fVar2.f54312j) {
            g gVar = this.f54311i;
            if (gVar != null) {
                if (!gVar.f54312j) {
                    return;
                }
                this.f54308f = this.f54310h * gVar.f54309g;
            }
            d(fVar2.f54309g + this.f54308f);
        }
        d dVar3 = this.f54303a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f54313k.add(dVar);
        if (this.f54312j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f54314l.clear();
        this.f54313k.clear();
        this.f54312j = false;
        this.f54309g = 0;
        this.f54305c = false;
        this.f54304b = false;
    }

    public void d(int i10) {
        if (this.f54312j) {
            return;
        }
        this.f54312j = true;
        this.f54309g = i10;
        for (d dVar : this.f54313k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f54306d.f54348b.r());
        sb2.append(":");
        sb2.append(this.f54307e);
        sb2.append("(");
        sb2.append(this.f54312j ? Integer.valueOf(this.f54309g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f54314l.size());
        sb2.append(":d=");
        sb2.append(this.f54313k.size());
        sb2.append(TopicConstant.MATCH_PREFIX);
        return sb2.toString();
    }
}
