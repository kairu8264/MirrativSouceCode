package b7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v6.o;
import v6.q;
import y6.b;
import z6.k;

/* loaded from: classes.dex */
public class i extends b7.b {
    public final StringBuilder B;
    public final RectF C;
    public final Matrix D;
    public final Paint E;
    public final Paint F;
    public final Map<y6.d, List<u6.d>> G;
    public final s.e<String> H;
    public final o I;
    public final s6.f J;
    public final s6.d K;
    public v6.a<Integer, Integer> L;
    public v6.a<Integer, Integer> M;
    public v6.a<Integer, Integer> N;
    public v6.a<Integer, Integer> O;
    public v6.a<Float, Float> P;
    public v6.a<Float, Float> Q;
    public v6.a<Float, Float> R;
    public v6.a<Float, Float> S;
    public v6.a<Float, Float> T;
    public v6.a<Typeface, Typeface> U;

    /* loaded from: classes.dex */
    public class a extends Paint {
        public a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    /* loaded from: classes.dex */
    public class b extends Paint {
        public b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17072a;

        static {
            int[] iArr = new int[b.a.values().length];
            f17072a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17072a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17072a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(s6.f fVar, e eVar) {
        super(fVar, eVar);
        z6.b bVar;
        z6.b bVar2;
        z6.a aVar;
        z6.a aVar2;
        this.B = new StringBuilder(2);
        this.C = new RectF();
        this.D = new Matrix();
        this.E = new a(1);
        this.F = new b(1);
        this.G = new HashMap();
        this.H = new s.e<>();
        this.J = fVar;
        this.K = eVar.b();
        o a10 = eVar.s().a();
        this.I = a10;
        a10.a(this);
        h(a10);
        k t10 = eVar.t();
        if (t10 != null && (aVar2 = t10.f62583a) != null) {
            v6.a<Integer, Integer> a11 = aVar2.a();
            this.L = a11;
            a11.a(this);
            h(this.L);
        }
        if (t10 != null && (aVar = t10.f62584b) != null) {
            v6.a<Integer, Integer> a12 = aVar.a();
            this.N = a12;
            a12.a(this);
            h(this.N);
        }
        if (t10 != null && (bVar2 = t10.f62585c) != null) {
            v6.a<Float, Float> a13 = bVar2.a();
            this.P = a13;
            a13.a(this);
            h(this.P);
        }
        if (t10 == null || (bVar = t10.f62586d) == null) {
            return;
        }
        v6.a<Float, Float> a14 = bVar.a();
        this.R = a14;
        a14.a(this);
        h(this.R);
    }

    public final void N(b.a aVar, Canvas canvas, float f10) {
        int i10 = c.f17072a[aVar.ordinal()];
        if (i10 == 2) {
            canvas.translate(-f10, 0.0f);
        } else if (i10 != 3) {
        } else {
            canvas.translate((-f10) / 2.0f, 0.0f);
        }
    }

    public final String O(String str, int i10) {
        int codePointAt = str.codePointAt(i10);
        int charCount = Character.charCount(codePointAt) + i10;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!b0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j10 = codePointAt;
        if (this.H.f(j10)) {
            return this.H.h(j10);
        }
        this.B.setLength(0);
        while (i10 < charCount) {
            int codePointAt3 = str.codePointAt(i10);
            this.B.appendCodePoint(codePointAt3);
            i10 += Character.charCount(codePointAt3);
        }
        String sb2 = this.B.toString();
        this.H.m(j10, sb2);
        return sb2;
    }

    public final void P(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public final void Q(y6.d dVar, Matrix matrix, float f10, y6.b bVar, Canvas canvas) {
        List<u6.d> X = X(dVar);
        for (int i10 = 0; i10 < X.size(); i10++) {
            Path path = X.get(i10).getPath();
            path.computeBounds(this.C, false);
            this.D.set(matrix);
            this.D.preTranslate(0.0f, (-bVar.f61253g) * f7.h.e());
            this.D.preScale(f10, f10);
            path.transform(this.D);
            if (bVar.f61257k) {
                T(path, this.E, canvas);
                T(path, this.F, canvas);
            } else {
                T(path, this.F, canvas);
                T(path, this.E, canvas);
            }
        }
    }

    public final void R(String str, y6.b bVar, Canvas canvas) {
        if (bVar.f61257k) {
            P(str, this.E, canvas);
            P(str, this.F, canvas);
            return;
        }
        P(str, this.F, canvas);
        P(str, this.E, canvas);
    }

    public final void S(String str, y6.b bVar, Canvas canvas, float f10) {
        int i10 = 0;
        while (i10 < str.length()) {
            String O = O(str, i10);
            i10 += O.length();
            R(O, bVar, canvas);
            canvas.translate(this.E.measureText(O) + f10, 0.0f);
        }
    }

    public final void T(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void U(String str, y6.b bVar, Matrix matrix, y6.c cVar, Canvas canvas, float f10, float f11) {
        float floatValue;
        for (int i10 = 0; i10 < str.length(); i10++) {
            y6.d h10 = this.K.c().h(y6.d.c(str.charAt(i10), cVar.a(), cVar.c()));
            if (h10 != null) {
                Q(h10, matrix, f11, bVar, canvas);
                float b10 = ((float) h10.b()) * f11 * f7.h.e() * f10;
                float f12 = bVar.f61251e / 10.0f;
                v6.a<Float, Float> aVar = this.S;
                if (aVar != null) {
                    floatValue = aVar.h().floatValue();
                } else {
                    v6.a<Float, Float> aVar2 = this.R;
                    if (aVar2 != null) {
                        floatValue = aVar2.h().floatValue();
                    }
                    canvas.translate(b10 + (f12 * f10), 0.0f);
                }
                f12 += floatValue;
                canvas.translate(b10 + (f12 * f10), 0.0f);
            }
        }
    }

    public final void V(y6.b bVar, Matrix matrix, y6.c cVar, Canvas canvas) {
        float f10;
        v6.a<Float, Float> aVar = this.T;
        if (aVar != null) {
            f10 = aVar.h().floatValue();
        } else {
            f10 = bVar.f61249c;
        }
        float f11 = f10 / 100.0f;
        float g10 = f7.h.g(matrix);
        String str = bVar.f61247a;
        float e10 = bVar.f61252f * f7.h.e();
        List<String> Z = Z(str);
        int size = Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = Z.get(i10);
            float Y = Y(str2, cVar, f11, g10);
            canvas.save();
            N(bVar.f61250d, canvas, Y);
            canvas.translate(0.0f, (i10 * e10) - (((size - 1) * e10) / 2.0f));
            U(str2, bVar, matrix, cVar, canvas, g10, f11);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[LOOP:0: B:17:0x0082->B:18:0x0084, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(y6.b r8, y6.c r9, android.graphics.Canvas r10) {
        /*
            r7 = this;
            android.graphics.Typeface r9 = r7.a0(r9)
            if (r9 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r8.f61247a
            s6.f r1 = r7.J
            r1.H()
            android.graphics.Paint r1 = r7.E
            r1.setTypeface(r9)
            v6.a<java.lang.Float, java.lang.Float> r9 = r7.T
            if (r9 == 0) goto L22
            java.lang.Object r9 = r9.h()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L24
        L22:
            float r9 = r8.f61249c
        L24:
            android.graphics.Paint r1 = r7.E
            float r2 = f7.h.e()
            float r2 = r2 * r9
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.F
            android.graphics.Paint r2 = r7.E
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.F
            android.graphics.Paint r2 = r7.E
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            float r1 = r8.f61252f
            float r2 = f7.h.e()
            float r1 = r1 * r2
            int r2 = r8.f61251e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            v6.a<java.lang.Float, java.lang.Float> r3 = r7.S
            if (r3 == 0) goto L61
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L5f:
            float r2 = r2 + r3
            goto L70
        L61:
            v6.a<java.lang.Float, java.lang.Float> r3 = r7.R
            if (r3 == 0) goto L70
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L5f
        L70:
            float r3 = f7.h.e()
            float r2 = r2 * r3
            float r2 = r2 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r9
            java.util.List r9 = r7.Z(r0)
            int r0 = r9.size()
            r3 = 0
        L82:
            if (r3 >= r0) goto Lb8
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.F
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10.save()
            y6.b$a r6 = r8.f61250d
            r7.N(r6, r10, r5)
            int r5 = r0 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r3
            float r6 = r6 * r1
            float r6 = r6 - r5
            r5 = 0
            r10.translate(r5, r6)
            r7.S(r4, r8, r10, r2)
            r10.restore()
            int r3 = r3 + 1
            goto L82
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.i.W(y6.b, y6.c, android.graphics.Canvas):void");
    }

    public final List<u6.d> X(y6.d dVar) {
        if (this.G.containsKey(dVar)) {
            return this.G.get(dVar);
        }
        List<a7.o> a10 = dVar.a();
        int size = a10.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new u6.d(this.J, this, a10.get(i10)));
        }
        this.G.put(dVar, arrayList);
        return arrayList;
    }

    public final float Y(String str, y6.c cVar, float f10, float f11) {
        float f12 = 0.0f;
        for (int i10 = 0; i10 < str.length(); i10++) {
            y6.d h10 = this.K.c().h(y6.d.c(str.charAt(i10), cVar.a(), cVar.c()));
            if (h10 != null) {
                f12 = (float) (f12 + (h10.b() * f10 * f7.h.e() * f11));
            }
        }
        return f12;
    }

    public final List<String> Z(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // b7.b, y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        super.a(t10, cVar);
        if (t10 == s6.k.f52138a) {
            v6.a<Integer, Integer> aVar = this.M;
            if (aVar != null) {
                F(aVar);
            }
            if (cVar == null) {
                this.M = null;
                return;
            }
            q qVar = new q(cVar);
            this.M = qVar;
            qVar.a(this);
            h(this.M);
        } else if (t10 == s6.k.f52139b) {
            v6.a<Integer, Integer> aVar2 = this.O;
            if (aVar2 != null) {
                F(aVar2);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            q qVar2 = new q(cVar);
            this.O = qVar2;
            qVar2.a(this);
            h(this.O);
        } else if (t10 == s6.k.f52156s) {
            v6.a<Float, Float> aVar3 = this.Q;
            if (aVar3 != null) {
                F(aVar3);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            q qVar3 = new q(cVar);
            this.Q = qVar3;
            qVar3.a(this);
            h(this.Q);
        } else if (t10 == s6.k.f52157t) {
            v6.a<Float, Float> aVar4 = this.S;
            if (aVar4 != null) {
                F(aVar4);
            }
            if (cVar == null) {
                this.S = null;
                return;
            }
            q qVar4 = new q(cVar);
            this.S = qVar4;
            qVar4.a(this);
            h(this.S);
        } else if (t10 == s6.k.F) {
            v6.a<Float, Float> aVar5 = this.T;
            if (aVar5 != null) {
                F(aVar5);
            }
            if (cVar == null) {
                this.T = null;
                return;
            }
            q qVar5 = new q(cVar);
            this.T = qVar5;
            qVar5.a(this);
            h(this.T);
        } else if (t10 == s6.k.M) {
            v6.a<Typeface, Typeface> aVar6 = this.U;
            if (aVar6 != null) {
                F(aVar6);
            }
            if (cVar == null) {
                this.U = null;
                return;
            }
            q qVar6 = new q(cVar);
            this.U = qVar6;
            qVar6.a(this);
            h(this.U);
        }
    }

    public final Typeface a0(y6.c cVar) {
        Typeface h10;
        v6.a<Typeface, Typeface> aVar = this.U;
        if (aVar == null || (h10 = aVar.h()) == null) {
            Typeface I = this.J.I(cVar.a(), cVar.c());
            return I != null ? I : cVar.d();
        }
        return h10;
    }

    public final boolean b0(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 19;
    }

    @Override // b7.b, u6.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.K.b().width(), this.K.b().height());
    }

    @Override // b7.b
    public void s(Canvas canvas, Matrix matrix, int i10) {
        canvas.save();
        if (!this.J.r0()) {
            canvas.concat(matrix);
        }
        y6.b h10 = this.I.h();
        y6.c cVar = this.K.g().get(h10.f61248b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        v6.a<Integer, Integer> aVar = this.M;
        if (aVar != null) {
            this.E.setColor(aVar.h().intValue());
        } else {
            v6.a<Integer, Integer> aVar2 = this.L;
            if (aVar2 != null) {
                this.E.setColor(aVar2.h().intValue());
            } else {
                this.E.setColor(h10.f61254h);
            }
        }
        v6.a<Integer, Integer> aVar3 = this.O;
        if (aVar3 != null) {
            this.F.setColor(aVar3.h().intValue());
        } else {
            v6.a<Integer, Integer> aVar4 = this.N;
            if (aVar4 != null) {
                this.F.setColor(aVar4.h().intValue());
            } else {
                this.F.setColor(h10.f61255i);
            }
        }
        int intValue = ((this.f17038v.h() == null ? 100 : this.f17038v.h().h().intValue()) * 255) / 100;
        this.E.setAlpha(intValue);
        this.F.setAlpha(intValue);
        v6.a<Float, Float> aVar5 = this.Q;
        if (aVar5 != null) {
            this.F.setStrokeWidth(aVar5.h().floatValue());
        } else {
            v6.a<Float, Float> aVar6 = this.P;
            if (aVar6 != null) {
                this.F.setStrokeWidth(aVar6.h().floatValue());
            } else {
                this.F.setStrokeWidth(h10.f61256j * f7.h.e() * f7.h.g(matrix));
            }
        }
        if (this.J.r0()) {
            V(h10, matrix, cVar, canvas);
        } else {
            W(h10, cVar, canvas);
        }
        canvas.restore();
    }
}
