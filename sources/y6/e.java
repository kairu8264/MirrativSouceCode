package y6;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f61269c = new e("COMPOSITION");

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f61270a;

    /* renamed from: b  reason: collision with root package name */
    public f f61271b;

    public e(String... strArr) {
        this.f61270a = Arrays.asList(strArr);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f61270a.add(str);
        return eVar;
    }

    public final boolean b() {
        List<String> list = this.f61270a;
        return list.get(list.size() - 1).equals("**");
    }

    public boolean c(String str, int i10) {
        if (i10 >= this.f61270a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f61270a.size() - 1;
        String str2 = this.f61270a.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == this.f61270a.size() + (-2) && b())) && (str2.equals(str) || str2.equals(TopicConstant.MATCH_SINGLE));
        }
        if (!z10 && this.f61270a.get(i10 + 1).equals(str)) {
            return i10 == this.f61270a.size() + (-2) || (i10 == this.f61270a.size() + (-3) && b());
        } else if (z10) {
            return true;
        } else {
            int i11 = i10 + 1;
            if (i11 < this.f61270a.size() - 1) {
                return false;
            }
            return this.f61270a.get(i11).equals(str);
        }
    }

    public f d() {
        return this.f61271b;
    }

    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (this.f61270a.get(i10).equals("**")) {
            return (i10 != this.f61270a.size() - 1 && this.f61270a.get(i10 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean f(String str) {
        return "__container".equals(str);
    }

    public boolean g(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f61270a.size()) {
            return false;
        }
        return this.f61270a.get(i10).equals(str) || this.f61270a.get(i10).equals("**") || this.f61270a.get(i10).equals(TopicConstant.MATCH_SINGLE);
    }

    public boolean h(String str, int i10) {
        return "__container".equals(str) || i10 < this.f61270a.size() - 1 || this.f61270a.get(i10).equals("**");
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f61271b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f61270a);
        sb2.append(",resolved=");
        sb2.append(this.f61271b != null);
        sb2.append('}');
        return sb2.toString();
    }

    public e(e eVar) {
        this.f61270a = new ArrayList(eVar.f61270a);
        this.f61271b = eVar.f61271b;
    }
}
