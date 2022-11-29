package wp;

import java.util.Comparator;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f59292a = 0;

    public a a(byte b10, byte b11) {
        if (this.f59292a != 0) {
            return this;
        }
        this.f59292a = b10 < b11 ? -1 : b10 > b11 ? 1 : 0;
        return this;
    }

    public a b(char c10, char c11) {
        if (this.f59292a != 0) {
            return this;
        }
        this.f59292a = c10 < c11 ? -1 : c10 > c11 ? 1 : 0;
        return this;
    }

    public a c(double d10, double d11) {
        if (this.f59292a != 0) {
            return this;
        }
        this.f59292a = Double.compare(d10, d11);
        return this;
    }

    public a d(float f10, float f11) {
        if (this.f59292a != 0) {
            return this;
        }
        this.f59292a = Float.compare(f10, f11);
        return this;
    }

    public a e(int i10, int i11) {
        if (this.f59292a != 0) {
            return this;
        }
        this.f59292a = i10 < i11 ? -1 : i10 > i11 ? 1 : 0;
        return this;
    }

    public a f(long j10, long j11) {
        if (this.f59292a != 0) {
            return this;
        }
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        this.f59292a = i10 < 0 ? -1 : i10 > 0 ? 1 : 0;
        return this;
    }

    public a g(Object obj, Object obj2) {
        return h(obj, obj2, null);
    }

    public a h(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.f59292a == 0 && obj != obj2) {
            if (obj == null) {
                this.f59292a = -1;
                return this;
            } else if (obj2 == null) {
                this.f59292a = 1;
                return this;
            } else {
                if (obj.getClass().isArray()) {
                    if (obj instanceof long[]) {
                        p((long[]) obj, (long[]) obj2);
                    } else if (obj instanceof int[]) {
                        o((int[]) obj, (int[]) obj2);
                    } else if (obj instanceof short[]) {
                        r((short[]) obj, (short[]) obj2);
                    } else if (obj instanceof char[]) {
                        l((char[]) obj, (char[]) obj2);
                    } else if (obj instanceof byte[]) {
                        k((byte[]) obj, (byte[]) obj2);
                    } else if (obj instanceof double[]) {
                        m((double[]) obj, (double[]) obj2);
                    } else if (obj instanceof float[]) {
                        n((float[]) obj, (float[]) obj2);
                    } else if (obj instanceof boolean[]) {
                        s((boolean[]) obj, (boolean[]) obj2);
                    } else {
                        q((Object[]) obj, (Object[]) obj2, comparator);
                    }
                } else if (comparator == null) {
                    this.f59292a = ((Comparable) obj).compareTo(obj2);
                } else {
                    this.f59292a = comparator.compare(obj, obj2);
                }
                return this;
            }
        }
        return this;
    }

    public a i(short s10, short s11) {
        if (this.f59292a != 0) {
            return this;
        }
        this.f59292a = s10 < s11 ? -1 : s10 > s11 ? 1 : 0;
        return this;
    }

    public a j(boolean z10, boolean z11) {
        if (this.f59292a == 0 && z10 != z11) {
            if (!z10) {
                this.f59292a = -1;
            } else {
                this.f59292a = 1;
            }
            return this;
        }
        return this;
    }

    public a k(byte[] bArr, byte[] bArr2) {
        if (this.f59292a == 0 && bArr != bArr2) {
            if (bArr == null) {
                this.f59292a = -1;
                return this;
            } else if (bArr2 == null) {
                this.f59292a = 1;
                return this;
            } else if (bArr.length != bArr2.length) {
                this.f59292a = bArr.length >= bArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i10 = 0; i10 < bArr.length && this.f59292a == 0; i10++) {
                    a(bArr[i10], bArr2[i10]);
                }
                return this;
            }
        }
        return this;
    }

    public a l(char[] cArr, char[] cArr2) {
        if (this.f59292a == 0 && cArr != cArr2) {
            if (cArr == null) {
                this.f59292a = -1;
                return this;
            } else if (cArr2 == null) {
                this.f59292a = 1;
                return this;
            } else if (cArr.length != cArr2.length) {
                this.f59292a = cArr.length >= cArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i10 = 0; i10 < cArr.length && this.f59292a == 0; i10++) {
                    b(cArr[i10], cArr2[i10]);
                }
                return this;
            }
        }
        return this;
    }

    public a m(double[] dArr, double[] dArr2) {
        if (this.f59292a == 0 && dArr != dArr2) {
            if (dArr == null) {
                this.f59292a = -1;
                return this;
            } else if (dArr2 == null) {
                this.f59292a = 1;
                return this;
            } else if (dArr.length != dArr2.length) {
                this.f59292a = dArr.length >= dArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i10 = 0; i10 < dArr.length && this.f59292a == 0; i10++) {
                    c(dArr[i10], dArr2[i10]);
                }
                return this;
            }
        }
        return this;
    }

    public a n(float[] fArr, float[] fArr2) {
        if (this.f59292a == 0 && fArr != fArr2) {
            if (fArr == null) {
                this.f59292a = -1;
                return this;
            } else if (fArr2 == null) {
                this.f59292a = 1;
                return this;
            } else if (fArr.length != fArr2.length) {
                this.f59292a = fArr.length >= fArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i10 = 0; i10 < fArr.length && this.f59292a == 0; i10++) {
                    d(fArr[i10], fArr2[i10]);
                }
                return this;
            }
        }
        return this;
    }

    public a o(int[] iArr, int[] iArr2) {
        if (this.f59292a == 0 && iArr != iArr2) {
            if (iArr == null) {
                this.f59292a = -1;
                return this;
            } else if (iArr2 == null) {
                this.f59292a = 1;
                return this;
            } else if (iArr.length != iArr2.length) {
                this.f59292a = iArr.length >= iArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i10 = 0; i10 < iArr.length && this.f59292a == 0; i10++) {
                    e(iArr[i10], iArr2[i10]);
                }
                return this;
            }
        }
        return this;
    }

    public a p(long[] jArr, long[] jArr2) {
        if (this.f59292a == 0 && jArr != jArr2) {
            if (jArr == null) {
                this.f59292a = -1;
                return this;
            } else if (jArr2 == null) {
                this.f59292a = 1;
                return this;
            } else if (jArr.length != jArr2.length) {
                this.f59292a = jArr.length >= jArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i10 = 0; i10 < jArr.length && this.f59292a == 0; i10++) {
                    f(jArr[i10], jArr2[i10]);
                }
                return this;
            }
        }
        return this;
    }

    public a q(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.f59292a == 0 && objArr != objArr2) {
            if (objArr == null) {
                this.f59292a = -1;
                return this;
            } else if (objArr2 == null) {
                this.f59292a = 1;
                return this;
            } else if (objArr.length != objArr2.length) {
                this.f59292a = objArr.length >= objArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i10 = 0; i10 < objArr.length && this.f59292a == 0; i10++) {
                    h(objArr[i10], objArr2[i10], comparator);
                }
                return this;
            }
        }
        return this;
    }

    public a r(short[] sArr, short[] sArr2) {
        if (this.f59292a == 0 && sArr != sArr2) {
            if (sArr == null) {
                this.f59292a = -1;
                return this;
            } else if (sArr2 == null) {
                this.f59292a = 1;
                return this;
            } else if (sArr.length != sArr2.length) {
                this.f59292a = sArr.length >= sArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i10 = 0; i10 < sArr.length && this.f59292a == 0; i10++) {
                    i(sArr[i10], sArr2[i10]);
                }
                return this;
            }
        }
        return this;
    }

    public a s(boolean[] zArr, boolean[] zArr2) {
        if (this.f59292a == 0 && zArr != zArr2) {
            if (zArr == null) {
                this.f59292a = -1;
                return this;
            } else if (zArr2 == null) {
                this.f59292a = 1;
                return this;
            } else if (zArr.length != zArr2.length) {
                this.f59292a = zArr.length >= zArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i10 = 0; i10 < zArr.length && this.f59292a == 0; i10++) {
                    j(zArr[i10], zArr2[i10]);
                }
                return this;
            }
        }
        return this;
    }

    public int t() {
        return this.f59292a;
    }
}
