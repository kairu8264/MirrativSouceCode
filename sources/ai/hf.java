package ai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class hf extends jf {
    public final long P0;
    public final List<Cif> Q0;
    public final List<hf> R0;

    public hf(int i10, long j10) {
        super(i10);
        this.P0 = j10;
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
    }

    public final void d(Cif cif) {
        this.Q0.add(cif);
    }

    public final void e(hf hfVar) {
        this.R0.add(hfVar);
    }

    public final Cif f(int i10) {
        int size = this.Q0.size();
        for (int i11 = 0; i11 < size; i11++) {
            Cif cif = this.Q0.get(i11);
            if (cif.f5764a == i10) {
                return cif;
            }
        }
        return null;
    }

    public final hf g(int i10) {
        int size = this.R0.size();
        for (int i11 = 0; i11 < size; i11++) {
            hf hfVar = this.R0.get(i11);
            if (hfVar.f5764a == i10) {
                return hfVar;
            }
        }
        return null;
    }

    @Override // ai.jf
    public final String toString() {
        String c10 = jf.c(this.f5764a);
        String arrays = Arrays.toString(this.Q0.toArray());
        String arrays2 = Arrays.toString(this.R0.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb2 = new StringBuilder(c10.length() + 22 + length + String.valueOf(arrays2).length());
        sb2.append(c10);
        sb2.append(" leaves: ");
        sb2.append(arrays);
        sb2.append(" containers: ");
        sb2.append(arrays2);
        return sb2.toString();
    }
}
