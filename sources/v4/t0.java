package v4;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class t0 implements z4.j, z4.i {
    public static final TreeMap<Integer, t0> E = new TreeMap<>();
    public final byte[][] A;
    public final int[] B;
    public final int C;
    public int D;

    /* renamed from: w  reason: collision with root package name */
    public volatile String f56717w;

    /* renamed from: x  reason: collision with root package name */
    public final long[] f56718x;

    /* renamed from: y  reason: collision with root package name */
    public final double[] f56719y;

    /* renamed from: z  reason: collision with root package name */
    public final String[] f56720z;

    public t0(int i10) {
        this.C = i10;
        int i11 = i10 + 1;
        this.B = new int[i11];
        this.f56718x = new long[i11];
        this.f56719y = new double[i11];
        this.f56720z = new String[i11];
        this.A = new byte[i11];
    }

    public static t0 d(String str, int i10) {
        TreeMap<Integer, t0> treeMap = E;
        synchronized (treeMap) {
            Map.Entry<Integer, t0> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                t0 value = ceilingEntry.getValue();
                value.e(str, i10);
                return value;
            }
            t0 t0Var = new t0(i10);
            t0Var.e(str, i10);
            return t0Var;
        }
    }

    public static void h() {
        TreeMap<Integer, t0> treeMap = E;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i10 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i10;
        }
    }

    @Override // z4.i
    public void J(int i10, double d10) {
        this.B[i10] = 3;
        this.f56719y[i10] = d10;
    }

    @Override // z4.i
    public void S0(int i10, String str) {
        this.B[i10] = 4;
        this.f56720z[i10] = str;
    }

    @Override // z4.j
    public String a() {
        return this.f56717w;
    }

    @Override // z4.j
    public void c(z4.i iVar) {
        for (int i10 = 1; i10 <= this.D; i10++) {
            int i11 = this.B[i10];
            if (i11 == 1) {
                iVar.y1(i10);
            } else if (i11 == 2) {
                iVar.g1(i10, this.f56718x[i10]);
            } else if (i11 == 3) {
                iVar.J(i10, this.f56719y[i10]);
            } else if (i11 == 4) {
                iVar.S0(i10, this.f56720z[i10]);
            } else if (i11 == 5) {
                iVar.l1(i10, this.A[i10]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void e(String str, int i10) {
        this.f56717w = str;
        this.D = i10;
    }

    @Override // z4.i
    public void g1(int i10, long j10) {
        this.B[i10] = 2;
        this.f56718x[i10] = j10;
    }

    public void i() {
        TreeMap<Integer, t0> treeMap = E;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.C), this);
            h();
        }
    }

    @Override // z4.i
    public void l1(int i10, byte[] bArr) {
        this.B[i10] = 5;
        this.A[i10] = bArr;
    }

    @Override // z4.i
    public void y1(int i10) {
        this.B[i10] = 1;
    }
}
