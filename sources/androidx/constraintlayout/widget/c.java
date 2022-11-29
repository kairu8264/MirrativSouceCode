package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import w2.j;

/* loaded from: classes.dex */
public class c {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f14811f = {0, 4, 8};

    /* renamed from: g  reason: collision with root package name */
    public static SparseIntArray f14812g = new SparseIntArray();

    /* renamed from: h  reason: collision with root package name */
    public static SparseIntArray f14813h = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public String f14814a = "";

    /* renamed from: b  reason: collision with root package name */
    public int f14815b = 0;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.a> f14816c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f14817d = true;

    /* renamed from: e  reason: collision with root package name */
    public HashMap<Integer, a> f14818e = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f14819a;

        /* renamed from: b  reason: collision with root package name */
        public String f14820b;

        /* renamed from: c  reason: collision with root package name */
        public final d f14821c = new d();

        /* renamed from: d  reason: collision with root package name */
        public final C0059c f14822d = new C0059c();

        /* renamed from: e  reason: collision with root package name */
        public final b f14823e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final e f14824f = new e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f14825g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        public C0058a f14826h;

        /* renamed from: androidx.constraintlayout.widget.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0058a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f14827a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f14828b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f14829c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f14830d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f14831e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f14832f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f14833g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f14834h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f14835i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f14836j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f14837k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f14838l = 0;

            public void a(int i10, float f10) {
                int i11 = this.f14832f;
                int[] iArr = this.f14830d;
                if (i11 >= iArr.length) {
                    this.f14830d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f14831e;
                    this.f14831e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f14830d;
                int i12 = this.f14832f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f14831e;
                this.f14832f = i12 + 1;
                fArr2[i12] = f10;
            }

            public void b(int i10, int i11) {
                int i12 = this.f14829c;
                int[] iArr = this.f14827a;
                if (i12 >= iArr.length) {
                    this.f14827a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f14828b;
                    this.f14828b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f14827a;
                int i13 = this.f14829c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f14828b;
                this.f14829c = i13 + 1;
                iArr4[i13] = i11;
            }

            public void c(int i10, String str) {
                int i11 = this.f14835i;
                int[] iArr = this.f14833g;
                if (i11 >= iArr.length) {
                    this.f14833g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f14834h;
                    this.f14834h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f14833g;
                int i12 = this.f14835i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f14834h;
                this.f14835i = i12 + 1;
                strArr2[i12] = str;
            }

            public void d(int i10, boolean z10) {
                int i11 = this.f14838l;
                int[] iArr = this.f14836j;
                if (i11 >= iArr.length) {
                    this.f14836j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f14837k;
                    this.f14837k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f14836j;
                int i12 = this.f14838l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f14837k;
                this.f14838l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f14823e;
            bVar.f14747d = bVar2.f14856i;
            bVar.f14749e = bVar2.f14858j;
            bVar.f14751f = bVar2.f14860k;
            bVar.f14753g = bVar2.f14862l;
            bVar.f14755h = bVar2.f14864m;
            bVar.f14757i = bVar2.f14866n;
            bVar.f14759j = bVar2.f14868o;
            bVar.f14761k = bVar2.f14870p;
            bVar.f14763l = bVar2.f14872q;
            bVar.f14765m = bVar2.f14873r;
            bVar.f14767n = bVar2.f14874s;
            bVar.f14775r = bVar2.f14875t;
            bVar.f14777s = bVar2.f14876u;
            bVar.f14779t = bVar2.f14877v;
            bVar.f14781u = bVar2.f14878w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.J;
            bVar.f14788z = bVar2.S;
            bVar.A = bVar2.R;
            bVar.f14785w = bVar2.O;
            bVar.f14787y = bVar2.Q;
            bVar.F = bVar2.f14879x;
            bVar.G = bVar2.f14880y;
            bVar.f14769o = bVar2.A;
            bVar.f14771p = bVar2.B;
            bVar.f14773q = bVar2.C;
            bVar.H = bVar2.f14881z;
            bVar.W = bVar2.D;
            bVar.X = bVar2.E;
            bVar.L = bVar2.U;
            bVar.K = bVar2.V;
            bVar.N = bVar2.X;
            bVar.M = bVar2.W;
            bVar.Z = bVar2.f14865m0;
            bVar.f14742a0 = bVar2.f14867n0;
            bVar.O = bVar2.Y;
            bVar.P = bVar2.Z;
            bVar.S = bVar2.f14841a0;
            bVar.T = bVar2.f14843b0;
            bVar.Q = bVar2.f14845c0;
            bVar.R = bVar2.f14847d0;
            bVar.U = bVar2.f14849e0;
            bVar.V = bVar2.f14851f0;
            bVar.Y = bVar2.F;
            bVar.f14745c = bVar2.f14854h;
            bVar.f14741a = bVar2.f14850f;
            bVar.f14743b = bVar2.f14852g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f14846d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f14848e;
            String str = bVar2.f14863l0;
            if (str != null) {
                bVar.f14744b0 = str;
            }
            bVar.f14746c0 = bVar2.f14871p0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(bVar2.L);
                bVar.setMarginEnd(this.f14823e.K);
            }
            bVar.a();
        }

        /* renamed from: e */
        public a clone() {
            a aVar = new a();
            aVar.f14823e.a(this.f14823e);
            aVar.f14822d.a(this.f14822d);
            aVar.f14821c.a(this.f14821c);
            aVar.f14824f.a(this.f14824f);
            aVar.f14819a = this.f14819a;
            aVar.f14826h = this.f14826h;
            return aVar;
        }

        public final void f(int i10, ConstraintLayout.b bVar) {
            this.f14819a = i10;
            b bVar2 = this.f14823e;
            bVar2.f14856i = bVar.f14747d;
            bVar2.f14858j = bVar.f14749e;
            bVar2.f14860k = bVar.f14751f;
            bVar2.f14862l = bVar.f14753g;
            bVar2.f14864m = bVar.f14755h;
            bVar2.f14866n = bVar.f14757i;
            bVar2.f14868o = bVar.f14759j;
            bVar2.f14870p = bVar.f14761k;
            bVar2.f14872q = bVar.f14763l;
            bVar2.f14873r = bVar.f14765m;
            bVar2.f14874s = bVar.f14767n;
            bVar2.f14875t = bVar.f14775r;
            bVar2.f14876u = bVar.f14777s;
            bVar2.f14877v = bVar.f14779t;
            bVar2.f14878w = bVar.f14781u;
            bVar2.f14879x = bVar.F;
            bVar2.f14880y = bVar.G;
            bVar2.f14881z = bVar.H;
            bVar2.A = bVar.f14769o;
            bVar2.B = bVar.f14771p;
            bVar2.C = bVar.f14773q;
            bVar2.D = bVar.W;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.f14854h = bVar.f14745c;
            bVar2.f14850f = bVar.f14741a;
            bVar2.f14852g = bVar.f14743b;
            bVar2.f14846d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f14848e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.M = bVar.C;
            bVar2.U = bVar.L;
            bVar2.V = bVar.K;
            bVar2.X = bVar.N;
            bVar2.W = bVar.M;
            bVar2.f14865m0 = bVar.Z;
            bVar2.f14867n0 = bVar.f14742a0;
            bVar2.Y = bVar.O;
            bVar2.Z = bVar.P;
            bVar2.f14841a0 = bVar.S;
            bVar2.f14843b0 = bVar.T;
            bVar2.f14845c0 = bVar.Q;
            bVar2.f14847d0 = bVar.R;
            bVar2.f14849e0 = bVar.U;
            bVar2.f14851f0 = bVar.V;
            bVar2.f14863l0 = bVar.f14744b0;
            bVar2.O = bVar.f14785w;
            bVar2.Q = bVar.f14787y;
            bVar2.N = bVar.f14783v;
            bVar2.P = bVar.f14786x;
            bVar2.S = bVar.f14788z;
            bVar2.R = bVar.A;
            bVar2.T = bVar.B;
            bVar2.f14871p0 = bVar.f14746c0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar2.K = bVar.getMarginEnd();
                this.f14823e.L = bVar.getMarginStart();
            }
        }

        public final void g(int i10, d.a aVar) {
            f(i10, aVar);
            this.f14821c.f14900d = aVar.f14918w0;
            e eVar = this.f14824f;
            eVar.f14904b = aVar.f14921z0;
            eVar.f14905c = aVar.A0;
            eVar.f14906d = aVar.B0;
            eVar.f14907e = aVar.C0;
            eVar.f14908f = aVar.D0;
            eVar.f14909g = aVar.E0;
            eVar.f14910h = aVar.F0;
            eVar.f14912j = aVar.G0;
            eVar.f14913k = aVar.H0;
            eVar.f14914l = aVar.I0;
            eVar.f14916n = aVar.f14920y0;
            eVar.f14915m = aVar.f14919x0;
        }

        public final void h(androidx.constraintlayout.widget.b bVar, int i10, d.a aVar) {
            g(i10, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f14823e;
                bVar2.f14857i0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f14853g0 = barrier.getType();
                this.f14823e.f14859j0 = barrier.getReferencedIds();
                this.f14823e.f14855h0 = barrier.getMargin();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: q0  reason: collision with root package name */
        public static SparseIntArray f14839q0;

        /* renamed from: d  reason: collision with root package name */
        public int f14846d;

        /* renamed from: e  reason: collision with root package name */
        public int f14848e;

        /* renamed from: j0  reason: collision with root package name */
        public int[] f14859j0;

        /* renamed from: k0  reason: collision with root package name */
        public String f14861k0;

        /* renamed from: l0  reason: collision with root package name */
        public String f14863l0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f14840a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f14842b = false;

        /* renamed from: c  reason: collision with root package name */
        public boolean f14844c = false;

        /* renamed from: f  reason: collision with root package name */
        public int f14850f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f14852g = -1;

        /* renamed from: h  reason: collision with root package name */
        public float f14854h = -1.0f;

        /* renamed from: i  reason: collision with root package name */
        public int f14856i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f14858j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f14860k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f14862l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f14864m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f14866n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f14868o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f14870p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f14872q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f14873r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f14874s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f14875t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f14876u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f14877v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f14878w = -1;

        /* renamed from: x  reason: collision with root package name */
        public float f14879x = 0.5f;

        /* renamed from: y  reason: collision with root package name */
        public float f14880y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public String f14881z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0  reason: collision with root package name */
        public int f14841a0 = 0;

        /* renamed from: b0  reason: collision with root package name */
        public int f14843b0 = 0;

        /* renamed from: c0  reason: collision with root package name */
        public int f14845c0 = 0;

        /* renamed from: d0  reason: collision with root package name */
        public int f14847d0 = 0;

        /* renamed from: e0  reason: collision with root package name */
        public float f14849e0 = 1.0f;

        /* renamed from: f0  reason: collision with root package name */
        public float f14851f0 = 1.0f;

        /* renamed from: g0  reason: collision with root package name */
        public int f14853g0 = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f14855h0 = 0;

        /* renamed from: i0  reason: collision with root package name */
        public int f14857i0 = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f14865m0 = false;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f14867n0 = false;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f14869o0 = true;

        /* renamed from: p0  reason: collision with root package name */
        public int f14871p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14839q0 = sparseIntArray;
            sparseIntArray.append(x2.d.H5, 24);
            f14839q0.append(x2.d.I5, 25);
            f14839q0.append(x2.d.K5, 28);
            f14839q0.append(x2.d.L5, 29);
            f14839q0.append(x2.d.Q5, 35);
            f14839q0.append(x2.d.P5, 34);
            f14839q0.append(x2.d.f59580r5, 4);
            f14839q0.append(x2.d.f59571q5, 3);
            f14839q0.append(x2.d.f59553o5, 1);
            f14839q0.append(x2.d.W5, 6);
            f14839q0.append(x2.d.X5, 7);
            f14839q0.append(x2.d.f59643y5, 17);
            f14839q0.append(x2.d.f59652z5, 18);
            f14839q0.append(x2.d.A5, 19);
            f14839q0.append(x2.d.X4, 26);
            f14839q0.append(x2.d.M5, 31);
            f14839q0.append(x2.d.N5, 32);
            f14839q0.append(x2.d.f59634x5, 10);
            f14839q0.append(x2.d.f59625w5, 9);
            f14839q0.append(x2.d.f59428a6, 13);
            f14839q0.append(x2.d.f59455d6, 16);
            f14839q0.append(x2.d.f59437b6, 14);
            f14839q0.append(x2.d.Y5, 11);
            f14839q0.append(x2.d.f59446c6, 15);
            f14839q0.append(x2.d.Z5, 12);
            f14839q0.append(x2.d.T5, 38);
            f14839q0.append(x2.d.F5, 37);
            f14839q0.append(x2.d.E5, 39);
            f14839q0.append(x2.d.S5, 40);
            f14839q0.append(x2.d.D5, 20);
            f14839q0.append(x2.d.R5, 36);
            f14839q0.append(x2.d.f59616v5, 5);
            f14839q0.append(x2.d.G5, 76);
            f14839q0.append(x2.d.O5, 76);
            f14839q0.append(x2.d.J5, 76);
            f14839q0.append(x2.d.f59562p5, 76);
            f14839q0.append(x2.d.f59544n5, 76);
            f14839q0.append(x2.d.f59427a5, 23);
            f14839q0.append(x2.d.f59445c5, 27);
            f14839q0.append(x2.d.f59463e5, 30);
            f14839q0.append(x2.d.f59472f5, 8);
            f14839q0.append(x2.d.f59436b5, 33);
            f14839q0.append(x2.d.f59454d5, 2);
            f14839q0.append(x2.d.Y4, 22);
            f14839q0.append(x2.d.Z4, 21);
            f14839q0.append(x2.d.U5, 41);
            f14839q0.append(x2.d.B5, 42);
            f14839q0.append(x2.d.f59535m5, 41);
            f14839q0.append(x2.d.f59526l5, 42);
            f14839q0.append(x2.d.f59464e6, 97);
            f14839q0.append(x2.d.f59589s5, 61);
            f14839q0.append(x2.d.f59607u5, 62);
            f14839q0.append(x2.d.f59598t5, 63);
            f14839q0.append(x2.d.V5, 69);
            f14839q0.append(x2.d.C5, 70);
            f14839q0.append(x2.d.f59508j5, 71);
            f14839q0.append(x2.d.f59490h5, 72);
            f14839q0.append(x2.d.f59499i5, 73);
            f14839q0.append(x2.d.f59517k5, 74);
            f14839q0.append(x2.d.f59481g5, 75);
        }

        public void a(b bVar) {
            this.f14840a = bVar.f14840a;
            this.f14846d = bVar.f14846d;
            this.f14842b = bVar.f14842b;
            this.f14848e = bVar.f14848e;
            this.f14850f = bVar.f14850f;
            this.f14852g = bVar.f14852g;
            this.f14854h = bVar.f14854h;
            this.f14856i = bVar.f14856i;
            this.f14858j = bVar.f14858j;
            this.f14860k = bVar.f14860k;
            this.f14862l = bVar.f14862l;
            this.f14864m = bVar.f14864m;
            this.f14866n = bVar.f14866n;
            this.f14868o = bVar.f14868o;
            this.f14870p = bVar.f14870p;
            this.f14872q = bVar.f14872q;
            this.f14873r = bVar.f14873r;
            this.f14874s = bVar.f14874s;
            this.f14875t = bVar.f14875t;
            this.f14876u = bVar.f14876u;
            this.f14877v = bVar.f14877v;
            this.f14878w = bVar.f14878w;
            this.f14879x = bVar.f14879x;
            this.f14880y = bVar.f14880y;
            this.f14881z = bVar.f14881z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f14841a0 = bVar.f14841a0;
            this.f14843b0 = bVar.f14843b0;
            this.f14845c0 = bVar.f14845c0;
            this.f14847d0 = bVar.f14847d0;
            this.f14849e0 = bVar.f14849e0;
            this.f14851f0 = bVar.f14851f0;
            this.f14853g0 = bVar.f14853g0;
            this.f14855h0 = bVar.f14855h0;
            this.f14857i0 = bVar.f14857i0;
            this.f14863l0 = bVar.f14863l0;
            int[] iArr = bVar.f14859j0;
            if (iArr != null && bVar.f14861k0 == null) {
                this.f14859j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f14859j0 = null;
            }
            this.f14861k0 = bVar.f14861k0;
            this.f14865m0 = bVar.f14865m0;
            this.f14867n0 = bVar.f14867n0;
            this.f14869o0 = bVar.f14869o0;
            this.f14871p0 = bVar.f14871p0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x2.d.W4);
            this.f14842b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f14839q0.get(index);
                if (i11 == 80) {
                    this.f14865m0 = obtainStyledAttributes.getBoolean(index, this.f14865m0);
                } else if (i11 == 81) {
                    this.f14867n0 = obtainStyledAttributes.getBoolean(index, this.f14867n0);
                } else if (i11 != 97) {
                    switch (i11) {
                        case 1:
                            this.f14872q = c.u(obtainStyledAttributes, index, this.f14872q);
                            continue;
                        case 2:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        case 3:
                            this.f14870p = c.u(obtainStyledAttributes, index, this.f14870p);
                            continue;
                        case 4:
                            this.f14868o = c.u(obtainStyledAttributes, index, this.f14868o);
                            continue;
                        case 5:
                            this.f14881z = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                            continue;
                        case 7:
                            this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                            continue;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            this.f14878w = c.u(obtainStyledAttributes, index, this.f14878w);
                            continue;
                        case 10:
                            this.f14877v = c.u(obtainStyledAttributes, index, this.f14877v);
                            continue;
                        case 11:
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            continue;
                        case 12:
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            continue;
                        case 13:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        case 14:
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            continue;
                        case 15:
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            continue;
                        case 16:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        case 17:
                            this.f14850f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14850f);
                            continue;
                        case 18:
                            this.f14852g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14852g);
                            continue;
                        case 19:
                            this.f14854h = obtainStyledAttributes.getFloat(index, this.f14854h);
                            continue;
                        case 20:
                            this.f14879x = obtainStyledAttributes.getFloat(index, this.f14879x);
                            continue;
                        case 21:
                            this.f14848e = obtainStyledAttributes.getLayoutDimension(index, this.f14848e);
                            continue;
                        case 22:
                            this.f14846d = obtainStyledAttributes.getLayoutDimension(index, this.f14846d);
                            continue;
                        case 23:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            continue;
                        case 24:
                            this.f14856i = c.u(obtainStyledAttributes, index, this.f14856i);
                            continue;
                        case 25:
                            this.f14858j = c.u(obtainStyledAttributes, index, this.f14858j);
                            continue;
                        case 26:
                            this.F = obtainStyledAttributes.getInt(index, this.F);
                            continue;
                        case 27:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            continue;
                        case 28:
                            this.f14860k = c.u(obtainStyledAttributes, index, this.f14860k);
                            continue;
                        case 29:
                            this.f14862l = c.u(obtainStyledAttributes, index, this.f14862l);
                            continue;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                break;
                            } else {
                                continue;
                            }
                        case 31:
                            this.f14875t = c.u(obtainStyledAttributes, index, this.f14875t);
                            continue;
                        case 32:
                            this.f14876u = c.u(obtainStyledAttributes, index, this.f14876u);
                            continue;
                        case 33:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            continue;
                        case 34:
                            this.f14866n = c.u(obtainStyledAttributes, index, this.f14866n);
                            continue;
                        case 35:
                            this.f14864m = c.u(obtainStyledAttributes, index, this.f14864m);
                            continue;
                        case 36:
                            this.f14880y = obtainStyledAttributes.getFloat(index, this.f14880y);
                            continue;
                        case 37:
                            this.V = obtainStyledAttributes.getFloat(index, this.V);
                            continue;
                        case 38:
                            this.U = obtainStyledAttributes.getFloat(index, this.U);
                            continue;
                        case 39:
                            this.W = obtainStyledAttributes.getInt(index, this.W);
                            continue;
                        case 40:
                            this.X = obtainStyledAttributes.getInt(index, this.X);
                            continue;
                        case 41:
                            c.v(this, obtainStyledAttributes, index, 0);
                            continue;
                        case 42:
                            c.v(this, obtainStyledAttributes, index, 1);
                            continue;
                        default:
                            switch (i11) {
                                case 54:
                                    this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                    continue;
                                case 55:
                                    this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                    continue;
                                case 56:
                                    this.f14841a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f14841a0);
                                    continue;
                                case 57:
                                    this.f14843b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f14843b0);
                                    continue;
                                case 58:
                                    this.f14845c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f14845c0);
                                    continue;
                                case 59:
                                    this.f14847d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f14847d0);
                                    continue;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.A = c.u(obtainStyledAttributes, index, this.A);
                                            continue;
                                        case 62:
                                            this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                            continue;
                                        case 63:
                                            this.C = obtainStyledAttributes.getFloat(index, this.C);
                                            continue;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.f14849e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f14851f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f14853g0 = obtainStyledAttributes.getInt(index, this.f14853g0);
                                                    continue;
                                                case 73:
                                                    this.f14855h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f14855h0);
                                                    continue;
                                                case 74:
                                                    this.f14861k0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f14869o0 = obtainStyledAttributes.getBoolean(index, this.f14869o0);
                                                    continue;
                                                case 76:
                                                    String hexString = Integer.toHexString(index);
                                                    int i12 = f14839q0.get(index);
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 33);
                                                    sb2.append("unused attribute 0x");
                                                    sb2.append(hexString);
                                                    sb2.append("   ");
                                                    sb2.append(i12);
                                                    Log.w("ConstraintSet", sb2.toString());
                                                    continue;
                                                case 77:
                                                    this.f14863l0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    switch (i11) {
                                                        case 91:
                                                            this.f14873r = c.u(obtainStyledAttributes, index, this.f14873r);
                                                            continue;
                                                        case 92:
                                                            this.f14874s = c.u(obtainStyledAttributes, index, this.f14874s);
                                                            continue;
                                                        case 93:
                                                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                                            continue;
                                                        case 94:
                                                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                                            continue;
                                                        default:
                                                            String hexString2 = Integer.toHexString(index);
                                                            int i13 = f14839q0.get(index);
                                                            StringBuilder sb3 = new StringBuilder(String.valueOf(hexString2).length() + 34);
                                                            sb3.append("Unknown attribute 0x");
                                                            sb3.append(hexString2);
                                                            sb3.append("   ");
                                                            sb3.append(i13);
                                                            Log.w("ConstraintSet", sb3.toString());
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    this.f14871p0 = obtainStyledAttributes.getInt(index, this.f14871p0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0059c {

        /* renamed from: o  reason: collision with root package name */
        public static SparseIntArray f14882o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f14883a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f14884b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f14885c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f14886d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f14887e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f14888f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f14889g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f14890h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f14891i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f14892j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f14893k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f14894l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f14895m = -3;

        /* renamed from: n  reason: collision with root package name */
        public int f14896n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14882o = sparseIntArray;
            sparseIntArray.append(x2.d.f59572q6, 1);
            f14882o.append(x2.d.f59590s6, 2);
            f14882o.append(x2.d.f59626w6, 3);
            f14882o.append(x2.d.f59563p6, 4);
            f14882o.append(x2.d.f59554o6, 5);
            f14882o.append(x2.d.f59545n6, 6);
            f14882o.append(x2.d.f59581r6, 7);
            f14882o.append(x2.d.f59617v6, 8);
            f14882o.append(x2.d.f59608u6, 9);
            f14882o.append(x2.d.f59599t6, 10);
        }

        public void a(C0059c c0059c) {
            this.f14883a = c0059c.f14883a;
            this.f14884b = c0059c.f14884b;
            this.f14886d = c0059c.f14886d;
            this.f14887e = c0059c.f14887e;
            this.f14888f = c0059c.f14888f;
            this.f14891i = c0059c.f14891i;
            this.f14889g = c0059c.f14889g;
            this.f14890h = c0059c.f14890h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x2.d.f59536m6);
            this.f14883a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f14882o.get(index)) {
                    case 1:
                        this.f14891i = obtainStyledAttributes.getFloat(index, this.f14891i);
                        break;
                    case 2:
                        this.f14887e = obtainStyledAttributes.getInt(index, this.f14887e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f14886d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f14886d = r2.b.f49709c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f14888f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f14884b = c.u(obtainStyledAttributes, index, this.f14884b);
                        break;
                    case 6:
                        this.f14885c = obtainStyledAttributes.getInteger(index, this.f14885c);
                        break;
                    case 7:
                        this.f14889g = obtainStyledAttributes.getFloat(index, this.f14889g);
                        break;
                    case 8:
                        this.f14893k = obtainStyledAttributes.getInteger(index, this.f14893k);
                        break;
                    case 9:
                        this.f14892j = obtainStyledAttributes.getFloat(index, this.f14892j);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f14896n = resourceId;
                            if (resourceId != -1) {
                                this.f14895m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i11 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f14894l = string;
                            if (string.indexOf("/") > 0) {
                                this.f14896n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f14895m = -2;
                                break;
                            } else {
                                this.f14895m = -1;
                                break;
                            }
                        } else {
                            this.f14895m = obtainStyledAttributes.getInteger(index, this.f14896n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f14897a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f14898b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f14899c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f14900d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f14901e = Float.NaN;

        public void a(d dVar) {
            this.f14897a = dVar.f14897a;
            this.f14898b = dVar.f14898b;
            this.f14900d = dVar.f14900d;
            this.f14901e = dVar.f14901e;
            this.f14899c = dVar.f14899c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x2.d.J6);
            this.f14897a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == x2.d.L6) {
                    this.f14900d = obtainStyledAttributes.getFloat(index, this.f14900d);
                } else if (index == x2.d.K6) {
                    this.f14898b = obtainStyledAttributes.getInt(index, this.f14898b);
                    this.f14898b = c.f14811f[this.f14898b];
                } else if (index == x2.d.N6) {
                    this.f14899c = obtainStyledAttributes.getInt(index, this.f14899c);
                } else if (index == x2.d.M6) {
                    this.f14901e = obtainStyledAttributes.getFloat(index, this.f14901e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: o  reason: collision with root package name */
        public static SparseIntArray f14902o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f14903a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f14904b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f14905c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f14906d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f14907e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f14908f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f14909g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f14910h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f14911i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f14912j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f14913k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f14914l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f14915m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f14916n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14902o = sparseIntArray;
            sparseIntArray.append(x2.d.f59501i7, 1);
            f14902o.append(x2.d.f59510j7, 2);
            f14902o.append(x2.d.f59519k7, 3);
            f14902o.append(x2.d.f59483g7, 4);
            f14902o.append(x2.d.f59492h7, 5);
            f14902o.append(x2.d.f59447c7, 6);
            f14902o.append(x2.d.f59456d7, 7);
            f14902o.append(x2.d.f59465e7, 8);
            f14902o.append(x2.d.f59474f7, 9);
            f14902o.append(x2.d.f59528l7, 10);
            f14902o.append(x2.d.f59537m7, 11);
            f14902o.append(x2.d.f59546n7, 12);
        }

        public void a(e eVar) {
            this.f14903a = eVar.f14903a;
            this.f14904b = eVar.f14904b;
            this.f14905c = eVar.f14905c;
            this.f14906d = eVar.f14906d;
            this.f14907e = eVar.f14907e;
            this.f14908f = eVar.f14908f;
            this.f14909g = eVar.f14909g;
            this.f14910h = eVar.f14910h;
            this.f14911i = eVar.f14911i;
            this.f14912j = eVar.f14912j;
            this.f14913k = eVar.f14913k;
            this.f14914l = eVar.f14914l;
            this.f14915m = eVar.f14915m;
            this.f14916n = eVar.f14916n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x2.d.f59438b7);
            this.f14903a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f14902o.get(index)) {
                    case 1:
                        this.f14904b = obtainStyledAttributes.getFloat(index, this.f14904b);
                        break;
                    case 2:
                        this.f14905c = obtainStyledAttributes.getFloat(index, this.f14905c);
                        break;
                    case 3:
                        this.f14906d = obtainStyledAttributes.getFloat(index, this.f14906d);
                        break;
                    case 4:
                        this.f14907e = obtainStyledAttributes.getFloat(index, this.f14907e);
                        break;
                    case 5:
                        this.f14908f = obtainStyledAttributes.getFloat(index, this.f14908f);
                        break;
                    case 6:
                        this.f14909g = obtainStyledAttributes.getDimension(index, this.f14909g);
                        break;
                    case 7:
                        this.f14910h = obtainStyledAttributes.getDimension(index, this.f14910h);
                        break;
                    case 8:
                        this.f14912j = obtainStyledAttributes.getDimension(index, this.f14912j);
                        break;
                    case 9:
                        this.f14913k = obtainStyledAttributes.getDimension(index, this.f14913k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f14914l = obtainStyledAttributes.getDimension(index, this.f14914l);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f14915m = true;
                            this.f14916n = obtainStyledAttributes.getDimension(index, this.f14916n);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        this.f14911i = c.u(obtainStyledAttributes, index, this.f14911i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f14812g.append(x2.d.f59647z0, 25);
        f14812g.append(x2.d.A0, 26);
        f14812g.append(x2.d.C0, 29);
        f14812g.append(x2.d.D0, 30);
        f14812g.append(x2.d.J0, 36);
        f14812g.append(x2.d.I0, 35);
        f14812g.append(x2.d.f59476g0, 4);
        f14812g.append(x2.d.f59467f0, 3);
        f14812g.append(x2.d.f59431b0, 1);
        f14812g.append(x2.d.f59449d0, 91);
        f14812g.append(x2.d.f59440c0, 92);
        f14812g.append(x2.d.S0, 6);
        f14812g.append(x2.d.T0, 7);
        f14812g.append(x2.d.f59539n0, 17);
        f14812g.append(x2.d.f59548o0, 18);
        f14812g.append(x2.d.f59557p0, 19);
        f14812g.append(x2.d.f59601u, 27);
        f14812g.append(x2.d.E0, 32);
        f14812g.append(x2.d.F0, 33);
        f14812g.append(x2.d.f59530m0, 10);
        f14812g.append(x2.d.f59521l0, 9);
        f14812g.append(x2.d.W0, 13);
        f14812g.append(x2.d.Z0, 16);
        f14812g.append(x2.d.X0, 14);
        f14812g.append(x2.d.U0, 11);
        f14812g.append(x2.d.Y0, 15);
        f14812g.append(x2.d.V0, 12);
        f14812g.append(x2.d.M0, 40);
        f14812g.append(x2.d.f59629x0, 39);
        f14812g.append(x2.d.f59620w0, 41);
        f14812g.append(x2.d.L0, 42);
        f14812g.append(x2.d.f59611v0, 20);
        f14812g.append(x2.d.K0, 37);
        f14812g.append(x2.d.f59512k0, 5);
        f14812g.append(x2.d.f59638y0, 87);
        f14812g.append(x2.d.H0, 87);
        f14812g.append(x2.d.B0, 87);
        f14812g.append(x2.d.f59458e0, 87);
        f14812g.append(x2.d.f59422a0, 87);
        f14812g.append(x2.d.f59646z, 24);
        f14812g.append(x2.d.B, 28);
        f14812g.append(x2.d.N, 31);
        f14812g.append(x2.d.O, 8);
        f14812g.append(x2.d.A, 34);
        f14812g.append(x2.d.C, 2);
        f14812g.append(x2.d.f59628x, 23);
        f14812g.append(x2.d.f59637y, 21);
        f14812g.append(x2.d.N0, 95);
        f14812g.append(x2.d.f59566q0, 96);
        f14812g.append(x2.d.f59619w, 22);
        f14812g.append(x2.d.D, 43);
        f14812g.append(x2.d.Q, 44);
        f14812g.append(x2.d.L, 45);
        f14812g.append(x2.d.M, 46);
        f14812g.append(x2.d.K, 60);
        f14812g.append(x2.d.I, 47);
        f14812g.append(x2.d.J, 48);
        f14812g.append(x2.d.E, 49);
        f14812g.append(x2.d.F, 50);
        f14812g.append(x2.d.G, 51);
        f14812g.append(x2.d.H, 52);
        f14812g.append(x2.d.P, 53);
        f14812g.append(x2.d.O0, 54);
        f14812g.append(x2.d.f59575r0, 55);
        f14812g.append(x2.d.P0, 56);
        f14812g.append(x2.d.f59584s0, 57);
        f14812g.append(x2.d.Q0, 58);
        f14812g.append(x2.d.f59593t0, 59);
        f14812g.append(x2.d.f59485h0, 61);
        f14812g.append(x2.d.f59503j0, 62);
        f14812g.append(x2.d.f59494i0, 63);
        f14812g.append(x2.d.R, 64);
        f14812g.append(x2.d.f59504j1, 65);
        f14812g.append(x2.d.X, 66);
        f14812g.append(x2.d.f59513k1, 67);
        f14812g.append(x2.d.f59441c1, 79);
        f14812g.append(x2.d.f59610v, 38);
        f14812g.append(x2.d.f59432b1, 68);
        f14812g.append(x2.d.R0, 69);
        f14812g.append(x2.d.f59602u0, 70);
        f14812g.append(x2.d.f59423a1, 97);
        f14812g.append(x2.d.V, 71);
        f14812g.append(x2.d.T, 72);
        f14812g.append(x2.d.U, 73);
        f14812g.append(x2.d.W, 74);
        f14812g.append(x2.d.S, 75);
        f14812g.append(x2.d.f59450d1, 76);
        f14812g.append(x2.d.G0, 77);
        f14812g.append(x2.d.f59522l1, 78);
        f14812g.append(x2.d.Z, 80);
        f14812g.append(x2.d.Y, 81);
        f14812g.append(x2.d.f59459e1, 82);
        f14812g.append(x2.d.f59495i1, 83);
        f14812g.append(x2.d.f59486h1, 84);
        f14812g.append(x2.d.f59477g1, 85);
        f14812g.append(x2.d.f59468f1, 86);
        SparseIntArray sparseIntArray = f14813h;
        int i10 = x2.d.P3;
        sparseIntArray.append(i10, 6);
        f14813h.append(i10, 7);
        f14813h.append(x2.d.K2, 27);
        f14813h.append(x2.d.S3, 13);
        f14813h.append(x2.d.V3, 16);
        f14813h.append(x2.d.T3, 14);
        f14813h.append(x2.d.Q3, 11);
        f14813h.append(x2.d.U3, 15);
        f14813h.append(x2.d.R3, 12);
        f14813h.append(x2.d.J3, 40);
        f14813h.append(x2.d.C3, 39);
        f14813h.append(x2.d.B3, 41);
        f14813h.append(x2.d.I3, 42);
        f14813h.append(x2.d.A3, 20);
        f14813h.append(x2.d.H3, 37);
        f14813h.append(x2.d.f59605u3, 5);
        f14813h.append(x2.d.D3, 87);
        f14813h.append(x2.d.G3, 87);
        f14813h.append(x2.d.E3, 87);
        f14813h.append(x2.d.f59578r3, 87);
        f14813h.append(x2.d.f59569q3, 87);
        f14813h.append(x2.d.P2, 24);
        f14813h.append(x2.d.R2, 28);
        f14813h.append(x2.d.f59452d3, 31);
        f14813h.append(x2.d.f59461e3, 8);
        f14813h.append(x2.d.Q2, 34);
        f14813h.append(x2.d.S2, 2);
        f14813h.append(x2.d.N2, 23);
        f14813h.append(x2.d.O2, 21);
        f14813h.append(x2.d.K3, 95);
        f14813h.append(x2.d.f59614v3, 96);
        f14813h.append(x2.d.M2, 22);
        f14813h.append(x2.d.T2, 43);
        f14813h.append(x2.d.f59479g3, 44);
        f14813h.append(x2.d.f59434b3, 45);
        f14813h.append(x2.d.f59443c3, 46);
        f14813h.append(x2.d.f59425a3, 60);
        f14813h.append(x2.d.Y2, 47);
        f14813h.append(x2.d.Z2, 48);
        f14813h.append(x2.d.U2, 49);
        f14813h.append(x2.d.V2, 50);
        f14813h.append(x2.d.W2, 51);
        f14813h.append(x2.d.X2, 52);
        f14813h.append(x2.d.f59470f3, 53);
        f14813h.append(x2.d.L3, 54);
        f14813h.append(x2.d.f59623w3, 55);
        f14813h.append(x2.d.M3, 56);
        f14813h.append(x2.d.f59632x3, 57);
        f14813h.append(x2.d.N3, 58);
        f14813h.append(x2.d.f59641y3, 59);
        f14813h.append(x2.d.f59596t3, 62);
        f14813h.append(x2.d.f59587s3, 63);
        f14813h.append(x2.d.f59488h3, 64);
        f14813h.append(x2.d.f59480g4, 65);
        f14813h.append(x2.d.f59542n3, 66);
        f14813h.append(x2.d.f59489h4, 67);
        f14813h.append(x2.d.Y3, 79);
        f14813h.append(x2.d.L2, 38);
        f14813h.append(x2.d.Z3, 98);
        f14813h.append(x2.d.X3, 68);
        f14813h.append(x2.d.O3, 69);
        f14813h.append(x2.d.f59650z3, 70);
        f14813h.append(x2.d.f59524l3, 71);
        f14813h.append(x2.d.f59506j3, 72);
        f14813h.append(x2.d.f59515k3, 73);
        f14813h.append(x2.d.f59533m3, 74);
        f14813h.append(x2.d.f59497i3, 75);
        f14813h.append(x2.d.f59426a4, 76);
        f14813h.append(x2.d.F3, 77);
        f14813h.append(x2.d.f59498i4, 78);
        f14813h.append(x2.d.f59560p3, 80);
        f14813h.append(x2.d.f59551o3, 81);
        f14813h.append(x2.d.f59435b4, 82);
        f14813h.append(x2.d.f59471f4, 83);
        f14813h.append(x2.d.f59462e4, 84);
        f14813h.append(x2.d.f59453d4, 85);
        f14813h.append(x2.d.f59444c4, 86);
        f14813h.append(x2.d.W3, 97);
    }

    public static int u(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    public static void v(Object obj, TypedArray typedArray, int i10, int i11) {
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        if (i12 != 3) {
            int i13 = -2;
            boolean z10 = false;
            if (i12 != 5) {
                int i14 = typedArray.getInt(i10, 0);
                if (i14 != -4) {
                    i13 = (i14 == -3 || !(i14 == -2 || i14 == -1)) ? 0 : i14;
                } else {
                    z10 = true;
                }
            } else {
                i13 = typedArray.getDimensionPixelSize(i10, 0);
            }
            if (obj instanceof ConstraintLayout.b) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar).width = i13;
                    bVar.Z = z10;
                    return;
                }
                ((ViewGroup.MarginLayoutParams) bVar).height = i13;
                bVar.f14742a0 = z10;
                return;
            } else if (obj instanceof b) {
                b bVar2 = (b) obj;
                if (i11 == 0) {
                    bVar2.f14846d = i13;
                    bVar2.f14865m0 = z10;
                    return;
                }
                bVar2.f14848e = i13;
                bVar2.f14867n0 = z10;
                return;
            } else if (obj instanceof a.C0058a) {
                a.C0058a c0058a = (a.C0058a) obj;
                if (i11 == 0) {
                    c0058a.b(23, i13);
                    c0058a.d(80, z10);
                    return;
                }
                c0058a.b(21, i13);
                c0058a.d(81, z10);
                return;
            } else {
                return;
            }
        }
        w(obj, typedArray.getString(i10), i11);
    }

    public static void w(Object obj, String str, int i10) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    x(bVar, trim2);
                    return;
                } else if (obj instanceof b) {
                    ((b) obj).f14881z = trim2;
                    return;
                } else if (obj instanceof a.C0058a) {
                    ((a.C0058a) obj).c(5, trim2);
                    return;
                } else {
                    return;
                }
            }
            try {
                if (ActivityChooserModel.ATTRIBUTE_WEIGHT.equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.K = parseFloat;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.L = parseFloat;
                        }
                    } else if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f14846d = 0;
                            bVar3.V = parseFloat;
                        } else {
                            bVar3.f14848e = 0;
                            bVar3.U = parseFloat;
                        }
                    } else if (obj instanceof a.C0058a) {
                        a.C0058a c0058a = (a.C0058a) obj;
                        if (i10 == 0) {
                            c0058a.b(23, 0);
                            c0058a.a(39, parseFloat);
                        } else {
                            c0058a.b(21, 0);
                            c0058a.a(40, parseFloat);
                        }
                    }
                } else if (!"parent".equalsIgnoreCase(trim)) {
                } else {
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.U = max;
                            bVar4.O = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.V = max;
                            bVar4.P = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f14846d = 0;
                            bVar5.f14849e0 = max;
                            bVar5.Y = 2;
                        } else {
                            bVar5.f14848e = 0;
                            bVar5.f14851f0 = max;
                            bVar5.Z = 2;
                        }
                    } else if (obj instanceof a.C0058a) {
                        a.C0058a c0058a2 = (a.C0058a) obj;
                        if (i10 == 0) {
                            c0058a2.b(23, 0);
                            c0058a2.b(54, 2);
                        } else {
                            c0058a2.b(21, 0);
                            c0058a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void x(ConstraintLayout.b bVar, String str) {
        float f10 = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i11, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i10 == 1) {
                                f10 = Math.abs(parseFloat2 / parseFloat);
                            } else {
                                f10 = Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i11);
                    if (substring4.length() > 0) {
                        f10 = Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.H = str;
        bVar.I = f10;
        bVar.J = i10;
    }

    public static void z(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0058a c0058a = new a.C0058a();
        aVar.f14826h = c0058a;
        aVar.f14822d.f14883a = false;
        aVar.f14823e.f14842b = false;
        aVar.f14821c.f14897a = false;
        aVar.f14824f.f14903a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f14813h.get(index)) {
                case 2:
                    c0058a.b(2, typedArray.getDimensionPixelSize(index, aVar.f14823e.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    String hexString = Integer.toHexString(index);
                    int i11 = f14812g.get(index);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 34);
                    sb2.append("Unknown attribute 0x");
                    sb2.append(hexString);
                    sb2.append("   ");
                    sb2.append(i11);
                    Log.w("ConstraintSet", sb2.toString());
                    break;
                case 5:
                    c0058a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0058a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f14823e.D));
                    break;
                case 7:
                    c0058a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f14823e.E));
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        c0058a.b(8, typedArray.getDimensionPixelSize(index, aVar.f14823e.K));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    c0058a.b(11, typedArray.getDimensionPixelSize(index, aVar.f14823e.Q));
                    break;
                case 12:
                    c0058a.b(12, typedArray.getDimensionPixelSize(index, aVar.f14823e.R));
                    break;
                case 13:
                    c0058a.b(13, typedArray.getDimensionPixelSize(index, aVar.f14823e.N));
                    break;
                case 14:
                    c0058a.b(14, typedArray.getDimensionPixelSize(index, aVar.f14823e.P));
                    break;
                case 15:
                    c0058a.b(15, typedArray.getDimensionPixelSize(index, aVar.f14823e.S));
                    break;
                case 16:
                    c0058a.b(16, typedArray.getDimensionPixelSize(index, aVar.f14823e.O));
                    break;
                case 17:
                    c0058a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f14823e.f14850f));
                    break;
                case 18:
                    c0058a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f14823e.f14852g));
                    break;
                case 19:
                    c0058a.a(19, typedArray.getFloat(index, aVar.f14823e.f14854h));
                    break;
                case 20:
                    c0058a.a(20, typedArray.getFloat(index, aVar.f14823e.f14879x));
                    break;
                case 21:
                    c0058a.b(21, typedArray.getLayoutDimension(index, aVar.f14823e.f14848e));
                    break;
                case 22:
                    c0058a.b(22, f14811f[typedArray.getInt(index, aVar.f14821c.f14898b)]);
                    break;
                case 23:
                    c0058a.b(23, typedArray.getLayoutDimension(index, aVar.f14823e.f14846d));
                    break;
                case 24:
                    c0058a.b(24, typedArray.getDimensionPixelSize(index, aVar.f14823e.G));
                    break;
                case 27:
                    c0058a.b(27, typedArray.getInt(index, aVar.f14823e.F));
                    break;
                case 28:
                    c0058a.b(28, typedArray.getDimensionPixelSize(index, aVar.f14823e.H));
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        c0058a.b(31, typedArray.getDimensionPixelSize(index, aVar.f14823e.L));
                        break;
                    } else {
                        break;
                    }
                case 34:
                    c0058a.b(34, typedArray.getDimensionPixelSize(index, aVar.f14823e.I));
                    break;
                case 37:
                    c0058a.a(37, typedArray.getFloat(index, aVar.f14823e.f14880y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f14819a);
                    aVar.f14819a = resourceId;
                    c0058a.b(38, resourceId);
                    break;
                case 39:
                    c0058a.a(39, typedArray.getFloat(index, aVar.f14823e.V));
                    break;
                case 40:
                    c0058a.a(40, typedArray.getFloat(index, aVar.f14823e.U));
                    break;
                case 41:
                    c0058a.b(41, typedArray.getInt(index, aVar.f14823e.W));
                    break;
                case 42:
                    c0058a.b(42, typedArray.getInt(index, aVar.f14823e.X));
                    break;
                case 43:
                    c0058a.a(43, typedArray.getFloat(index, aVar.f14821c.f14900d));
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        c0058a.d(44, true);
                        c0058a.a(44, typedArray.getDimension(index, aVar.f14824f.f14916n));
                        break;
                    } else {
                        break;
                    }
                case 45:
                    c0058a.a(45, typedArray.getFloat(index, aVar.f14824f.f14905c));
                    break;
                case 46:
                    c0058a.a(46, typedArray.getFloat(index, aVar.f14824f.f14906d));
                    break;
                case 47:
                    c0058a.a(47, typedArray.getFloat(index, aVar.f14824f.f14907e));
                    break;
                case 48:
                    c0058a.a(48, typedArray.getFloat(index, aVar.f14824f.f14908f));
                    break;
                case 49:
                    c0058a.a(49, typedArray.getDimension(index, aVar.f14824f.f14909g));
                    break;
                case 50:
                    c0058a.a(50, typedArray.getDimension(index, aVar.f14824f.f14910h));
                    break;
                case 51:
                    c0058a.a(51, typedArray.getDimension(index, aVar.f14824f.f14912j));
                    break;
                case 52:
                    c0058a.a(52, typedArray.getDimension(index, aVar.f14824f.f14913k));
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        c0058a.a(53, typedArray.getDimension(index, aVar.f14824f.f14914l));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    c0058a.b(54, typedArray.getInt(index, aVar.f14823e.Y));
                    break;
                case 55:
                    c0058a.b(55, typedArray.getInt(index, aVar.f14823e.Z));
                    break;
                case 56:
                    c0058a.b(56, typedArray.getDimensionPixelSize(index, aVar.f14823e.f14841a0));
                    break;
                case 57:
                    c0058a.b(57, typedArray.getDimensionPixelSize(index, aVar.f14823e.f14843b0));
                    break;
                case 58:
                    c0058a.b(58, typedArray.getDimensionPixelSize(index, aVar.f14823e.f14845c0));
                    break;
                case 59:
                    c0058a.b(59, typedArray.getDimensionPixelSize(index, aVar.f14823e.f14847d0));
                    break;
                case 60:
                    c0058a.a(60, typedArray.getFloat(index, aVar.f14824f.f14904b));
                    break;
                case 62:
                    c0058a.b(62, typedArray.getDimensionPixelSize(index, aVar.f14823e.B));
                    break;
                case 63:
                    c0058a.a(63, typedArray.getFloat(index, aVar.f14823e.C));
                    break;
                case 64:
                    c0058a.b(64, u(typedArray, index, aVar.f14822d.f14884b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0058a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0058a.c(65, r2.b.f49709c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0058a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0058a.a(67, typedArray.getFloat(index, aVar.f14822d.f14891i));
                    break;
                case 68:
                    c0058a.a(68, typedArray.getFloat(index, aVar.f14821c.f14901e));
                    break;
                case 69:
                    c0058a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0058a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0058a.b(72, typedArray.getInt(index, aVar.f14823e.f14853g0));
                    break;
                case 73:
                    c0058a.b(73, typedArray.getDimensionPixelSize(index, aVar.f14823e.f14855h0));
                    break;
                case 74:
                    c0058a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0058a.d(75, typedArray.getBoolean(index, aVar.f14823e.f14869o0));
                    break;
                case 76:
                    c0058a.b(76, typedArray.getInt(index, aVar.f14822d.f14887e));
                    break;
                case 77:
                    c0058a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0058a.b(78, typedArray.getInt(index, aVar.f14821c.f14899c));
                    break;
                case 79:
                    c0058a.a(79, typedArray.getFloat(index, aVar.f14822d.f14889g));
                    break;
                case 80:
                    c0058a.d(80, typedArray.getBoolean(index, aVar.f14823e.f14865m0));
                    break;
                case 81:
                    c0058a.d(81, typedArray.getBoolean(index, aVar.f14823e.f14867n0));
                    break;
                case 82:
                    c0058a.b(82, typedArray.getInteger(index, aVar.f14822d.f14885c));
                    break;
                case 83:
                    c0058a.b(83, u(typedArray, index, aVar.f14824f.f14911i));
                    break;
                case 84:
                    c0058a.b(84, typedArray.getInteger(index, aVar.f14822d.f14893k));
                    break;
                case 85:
                    c0058a.a(85, typedArray.getFloat(index, aVar.f14822d.f14892j));
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        aVar.f14822d.f14896n = typedArray.getResourceId(index, -1);
                        c0058a.b(89, aVar.f14822d.f14896n);
                        C0059c c0059c = aVar.f14822d;
                        if (c0059c.f14896n != -1) {
                            c0059c.f14895m = -2;
                            c0058a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i12 == 3) {
                        aVar.f14822d.f14894l = typedArray.getString(index);
                        c0058a.c(90, aVar.f14822d.f14894l);
                        if (aVar.f14822d.f14894l.indexOf("/") > 0) {
                            aVar.f14822d.f14896n = typedArray.getResourceId(index, -1);
                            c0058a.b(89, aVar.f14822d.f14896n);
                            aVar.f14822d.f14895m = -2;
                            c0058a.b(88, -2);
                            break;
                        } else {
                            aVar.f14822d.f14895m = -1;
                            c0058a.b(88, -1);
                            break;
                        }
                    } else {
                        C0059c c0059c2 = aVar.f14822d;
                        c0059c2.f14895m = typedArray.getInteger(index, c0059c2.f14896n);
                        c0058a.b(88, aVar.f14822d.f14895m);
                        break;
                    }
                case 87:
                    String hexString2 = Integer.toHexString(index);
                    int i13 = f14812g.get(index);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(hexString2).length() + 33);
                    sb3.append("unused attribute 0x");
                    sb3.append(hexString2);
                    sb3.append("   ");
                    sb3.append(i13);
                    Log.w("ConstraintSet", sb3.toString());
                    break;
                case 93:
                    c0058a.b(93, typedArray.getDimensionPixelSize(index, aVar.f14823e.M));
                    break;
                case 94:
                    c0058a.b(94, typedArray.getDimensionPixelSize(index, aVar.f14823e.T));
                    break;
                case 95:
                    v(c0058a, typedArray, index, 0);
                    break;
                case 96:
                    v(c0058a, typedArray, index, 1);
                    break;
                case 97:
                    c0058a.b(97, typedArray.getInt(index, aVar.f14823e.f14871p0));
                    break;
                case 98:
                    if (j.T0) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f14819a);
                        aVar.f14819a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f14820b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f14820b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f14819a = typedArray.getResourceId(index, aVar.f14819a);
                        break;
                    }
            }
        }
    }

    public void A(int i10, int i11, int i12) {
        a r10 = r(i10);
        switch (i11) {
            case 1:
                r10.f14823e.G = i12;
                return;
            case 2:
                r10.f14823e.H = i12;
                return;
            case 3:
                r10.f14823e.I = i12;
                return;
            case 4:
                r10.f14823e.J = i12;
                return;
            case 5:
                r10.f14823e.M = i12;
                return;
            case 6:
                r10.f14823e.L = i12;
                return;
            case 7:
                r10.f14823e.K = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void B(int i10, float f10) {
        r(i10).f14824f.f14912j = f10;
    }

    public void C(int i10, float f10) {
        r(i10).f14824f.f14913k = f10;
    }

    public final String D(int i10) {
        switch (i10) {
            case 1:
                return TtmlNode.LEFT;
            case 2:
                return TtmlNode.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return TtmlNode.START;
            case 7:
                return TtmlNode.END;
            default:
                return "undefined";
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean z10) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f14818e.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f14818e.containsKey(Integer.valueOf(id2))) {
                String valueOf = String.valueOf(w2.a.b(childAt));
                Log.w("ConstraintSet", valueOf.length() != 0 ? "id unknown ".concat(valueOf) : new String("id unknown "));
            } else if (this.f14817d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id2 != -1) {
                    if (this.f14818e.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f14818e.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f14823e.f14857i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f14823e.f14853g0);
                                barrier.setMargin(aVar.f14823e.f14855h0);
                                barrier.setAllowsGoneWidget(aVar.f14823e.f14869o0);
                                b bVar = aVar.f14823e;
                                int[] iArr = bVar.f14859j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f14861k0;
                                    if (str != null) {
                                        bVar.f14859j0 = n(barrier, str);
                                        barrier.setReferencedIds(aVar.f14823e.f14859j0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.d(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.a.d(childAt, aVar.f14825g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f14821c;
                            if (dVar.f14899c == 0) {
                                childAt.setVisibility(dVar.f14898b);
                            }
                            int i11 = Build.VERSION.SDK_INT;
                            if (i11 >= 17) {
                                childAt.setAlpha(aVar.f14821c.f14900d);
                                childAt.setRotation(aVar.f14824f.f14904b);
                                childAt.setRotationX(aVar.f14824f.f14905c);
                                childAt.setRotationY(aVar.f14824f.f14906d);
                                childAt.setScaleX(aVar.f14824f.f14907e);
                                childAt.setScaleY(aVar.f14824f.f14908f);
                                e eVar = aVar.f14824f;
                                if (eVar.f14911i != -1) {
                                    if (((View) childAt.getParent()).findViewById(aVar.f14824f.f14911i) != null) {
                                        float top = (findViewById.getTop() + findViewById.getBottom()) / 2.0f;
                                        float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
                                        if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                            childAt.setPivotX(left - childAt.getLeft());
                                            childAt.setPivotY(top - childAt.getTop());
                                        }
                                    }
                                } else {
                                    if (!Float.isNaN(eVar.f14909g)) {
                                        childAt.setPivotX(aVar.f14824f.f14909g);
                                    }
                                    if (!Float.isNaN(aVar.f14824f.f14910h)) {
                                        childAt.setPivotY(aVar.f14824f.f14910h);
                                    }
                                }
                                childAt.setTranslationX(aVar.f14824f.f14912j);
                                childAt.setTranslationY(aVar.f14824f.f14913k);
                                if (i11 >= 21) {
                                    childAt.setTranslationZ(aVar.f14824f.f14914l);
                                    e eVar2 = aVar.f14824f;
                                    if (eVar2.f14915m) {
                                        childAt.setElevation(eVar2.f14916n);
                                    }
                                }
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(43);
                        sb2.append("WARNING NO CONSTRAINTS for view ");
                        sb2.append(id2);
                        Log.v("ConstraintSet", sb2.toString());
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f14818e.get(num);
            if (aVar2 != null) {
                if (aVar2.f14823e.f14857i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f14823e;
                    int[] iArr2 = bVar3.f14859j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f14861k0;
                        if (str2 != null) {
                            bVar3.f14859j0 = n(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f14823e.f14859j0);
                        }
                    }
                    barrier2.setType(aVar2.f14823e.f14853g0);
                    barrier2.setMargin(aVar2.f14823e.f14855h0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.s();
                    aVar2.d(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.f14823e.f14840a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.d(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(int i10, int i11) {
        a aVar;
        if (!this.f14818e.containsKey(Integer.valueOf(i10)) || (aVar = this.f14818e.get(Integer.valueOf(i10))) == null) {
            return;
        }
        switch (i11) {
            case 1:
                b bVar = aVar.f14823e;
                bVar.f14858j = -1;
                bVar.f14856i = -1;
                bVar.G = -1;
                bVar.N = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.f14823e;
                bVar2.f14862l = -1;
                bVar2.f14860k = -1;
                bVar2.H = -1;
                bVar2.P = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.f14823e;
                bVar3.f14866n = -1;
                bVar3.f14864m = -1;
                bVar3.I = 0;
                bVar3.O = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.f14823e;
                bVar4.f14868o = -1;
                bVar4.f14870p = -1;
                bVar4.J = 0;
                bVar4.Q = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.f14823e;
                bVar5.f14872q = -1;
                bVar5.f14873r = -1;
                bVar5.f14874s = -1;
                bVar5.M = 0;
                bVar5.T = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.f14823e;
                bVar6.f14875t = -1;
                bVar6.f14876u = -1;
                bVar6.L = 0;
                bVar6.S = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.f14823e;
                bVar7.f14877v = -1;
                bVar7.f14878w = -1;
                bVar7.K = 0;
                bVar7.R = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.f14823e;
                bVar8.C = -1.0f;
                bVar8.B = -1;
                bVar8.A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void f(Context context, int i10) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f14818e.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f14817d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f14818e.containsKey(Integer.valueOf(id2))) {
                this.f14818e.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f14818e.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f14825g = androidx.constraintlayout.widget.a.b(this.f14816c, childAt);
                aVar.f(id2, bVar);
                aVar.f14821c.f14898b = childAt.getVisibility();
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 17) {
                    aVar.f14821c.f14900d = childAt.getAlpha();
                    aVar.f14824f.f14904b = childAt.getRotation();
                    aVar.f14824f.f14905c = childAt.getRotationX();
                    aVar.f14824f.f14906d = childAt.getRotationY();
                    aVar.f14824f.f14907e = childAt.getScaleX();
                    aVar.f14824f.f14908f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar = aVar.f14824f;
                        eVar.f14909g = pivotX;
                        eVar.f14910h = pivotY;
                    }
                    aVar.f14824f.f14912j = childAt.getTranslationX();
                    aVar.f14824f.f14913k = childAt.getTranslationY();
                    if (i11 >= 21) {
                        aVar.f14824f.f14914l = childAt.getTranslationZ();
                        e eVar2 = aVar.f14824f;
                        if (eVar2.f14915m) {
                            eVar2.f14916n = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f14823e.f14869o0 = barrier.getAllowsGoneWidget();
                    aVar.f14823e.f14859j0 = barrier.getReferencedIds();
                    aVar.f14823e.f14853g0 = barrier.getType();
                    aVar.f14823e.f14855h0 = barrier.getMargin();
                }
            }
        }
    }

    public void h(androidx.constraintlayout.widget.d dVar) {
        int childCount = dVar.getChildCount();
        this.f14818e.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = dVar.getChildAt(i10);
            d.a aVar = (d.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f14817d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f14818e.containsKey(Integer.valueOf(id2))) {
                this.f14818e.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f14818e.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.h((androidx.constraintlayout.widget.b) childAt, id2, aVar);
                }
                aVar2.g(id2, aVar);
            }
        }
    }

    public void i(int i10, int i11, int i12, int i13) {
        if (!this.f14818e.containsKey(Integer.valueOf(i10))) {
            this.f14818e.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f14818e.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f14823e;
                    bVar.f14856i = i12;
                    bVar.f14858j = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar2 = aVar.f14823e;
                    bVar2.f14858j = i12;
                    bVar2.f14856i = -1;
                    return;
                } else {
                    String D = D(i13);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(D).length() + 18);
                    sb2.append("left to ");
                    sb2.append(D);
                    sb2.append(" undefined");
                    throw new IllegalArgumentException(sb2.toString());
                }
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f14823e;
                    bVar3.f14860k = i12;
                    bVar3.f14862l = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar4 = aVar.f14823e;
                    bVar4.f14862l = i12;
                    bVar4.f14860k = -1;
                    return;
                } else {
                    String D2 = D(i13);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(D2).length() + 19);
                    sb3.append("right to ");
                    sb3.append(D2);
                    sb3.append(" undefined");
                    throw new IllegalArgumentException(sb3.toString());
                }
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f14823e;
                    bVar5.f14864m = i12;
                    bVar5.f14866n = -1;
                    bVar5.f14872q = -1;
                    bVar5.f14873r = -1;
                    bVar5.f14874s = -1;
                    return;
                } else if (i13 == 4) {
                    b bVar6 = aVar.f14823e;
                    bVar6.f14866n = i12;
                    bVar6.f14864m = -1;
                    bVar6.f14872q = -1;
                    bVar6.f14873r = -1;
                    bVar6.f14874s = -1;
                    return;
                } else {
                    String D3 = D(i13);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(D3).length() + 19);
                    sb4.append("right to ");
                    sb4.append(D3);
                    sb4.append(" undefined");
                    throw new IllegalArgumentException(sb4.toString());
                }
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f14823e;
                    bVar7.f14870p = i12;
                    bVar7.f14868o = -1;
                    bVar7.f14872q = -1;
                    bVar7.f14873r = -1;
                    bVar7.f14874s = -1;
                    return;
                } else if (i13 == 3) {
                    b bVar8 = aVar.f14823e;
                    bVar8.f14868o = i12;
                    bVar8.f14870p = -1;
                    bVar8.f14872q = -1;
                    bVar8.f14873r = -1;
                    bVar8.f14874s = -1;
                    return;
                } else {
                    String D4 = D(i13);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(D4).length() + 19);
                    sb5.append("right to ");
                    sb5.append(D4);
                    sb5.append(" undefined");
                    throw new IllegalArgumentException(sb5.toString());
                }
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f14823e;
                    bVar9.f14872q = i12;
                    bVar9.f14870p = -1;
                    bVar9.f14868o = -1;
                    bVar9.f14864m = -1;
                    bVar9.f14866n = -1;
                    return;
                } else if (i13 == 3) {
                    b bVar10 = aVar.f14823e;
                    bVar10.f14873r = i12;
                    bVar10.f14870p = -1;
                    bVar10.f14868o = -1;
                    bVar10.f14864m = -1;
                    bVar10.f14866n = -1;
                    return;
                } else if (i13 == 4) {
                    b bVar11 = aVar.f14823e;
                    bVar11.f14874s = i12;
                    bVar11.f14870p = -1;
                    bVar11.f14868o = -1;
                    bVar11.f14864m = -1;
                    bVar11.f14866n = -1;
                    return;
                } else {
                    String D5 = D(i13);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(D5).length() + 19);
                    sb6.append("right to ");
                    sb6.append(D5);
                    sb6.append(" undefined");
                    throw new IllegalArgumentException(sb6.toString());
                }
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f14823e;
                    bVar12.f14876u = i12;
                    bVar12.f14875t = -1;
                    return;
                } else if (i13 == 7) {
                    b bVar13 = aVar.f14823e;
                    bVar13.f14875t = i12;
                    bVar13.f14876u = -1;
                    return;
                } else {
                    String D6 = D(i13);
                    StringBuilder sb7 = new StringBuilder(String.valueOf(D6).length() + 19);
                    sb7.append("right to ");
                    sb7.append(D6);
                    sb7.append(" undefined");
                    throw new IllegalArgumentException(sb7.toString());
                }
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f14823e;
                    bVar14.f14878w = i12;
                    bVar14.f14877v = -1;
                    return;
                } else if (i13 == 6) {
                    b bVar15 = aVar.f14823e;
                    bVar15.f14877v = i12;
                    bVar15.f14878w = -1;
                    return;
                } else {
                    String D7 = D(i13);
                    StringBuilder sb8 = new StringBuilder(String.valueOf(D7).length() + 19);
                    sb8.append("right to ");
                    sb8.append(D7);
                    sb8.append(" undefined");
                    throw new IllegalArgumentException(sb8.toString());
                }
            default:
                String D8 = D(i11);
                String D9 = D(i13);
                StringBuilder sb9 = new StringBuilder(String.valueOf(D8).length() + 12 + String.valueOf(D9).length());
                sb9.append(D8);
                sb9.append(" to ");
                sb9.append(D9);
                sb9.append(" unknown");
                throw new IllegalArgumentException(sb9.toString());
        }
    }

    public void j(int i10, int i11, int i12, int i13, int i14) {
        if (!this.f14818e.containsKey(Integer.valueOf(i10))) {
            this.f14818e.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f14818e.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f14823e;
                    bVar.f14856i = i12;
                    bVar.f14858j = -1;
                } else if (i13 == 2) {
                    b bVar2 = aVar.f14823e;
                    bVar2.f14858j = i12;
                    bVar2.f14856i = -1;
                } else {
                    String D = D(i13);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(D).length() + 18);
                    sb2.append("Left to ");
                    sb2.append(D);
                    sb2.append(" undefined");
                    throw new IllegalArgumentException(sb2.toString());
                }
                aVar.f14823e.G = i14;
                return;
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f14823e;
                    bVar3.f14860k = i12;
                    bVar3.f14862l = -1;
                } else if (i13 == 2) {
                    b bVar4 = aVar.f14823e;
                    bVar4.f14862l = i12;
                    bVar4.f14860k = -1;
                } else {
                    String D2 = D(i13);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(D2).length() + 19);
                    sb3.append("right to ");
                    sb3.append(D2);
                    sb3.append(" undefined");
                    throw new IllegalArgumentException(sb3.toString());
                }
                aVar.f14823e.H = i14;
                return;
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f14823e;
                    bVar5.f14864m = i12;
                    bVar5.f14866n = -1;
                    bVar5.f14872q = -1;
                    bVar5.f14873r = -1;
                    bVar5.f14874s = -1;
                } else if (i13 == 4) {
                    b bVar6 = aVar.f14823e;
                    bVar6.f14866n = i12;
                    bVar6.f14864m = -1;
                    bVar6.f14872q = -1;
                    bVar6.f14873r = -1;
                    bVar6.f14874s = -1;
                } else {
                    String D3 = D(i13);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(D3).length() + 19);
                    sb4.append("right to ");
                    sb4.append(D3);
                    sb4.append(" undefined");
                    throw new IllegalArgumentException(sb4.toString());
                }
                aVar.f14823e.I = i14;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f14823e;
                    bVar7.f14870p = i12;
                    bVar7.f14868o = -1;
                    bVar7.f14872q = -1;
                    bVar7.f14873r = -1;
                    bVar7.f14874s = -1;
                } else if (i13 == 3) {
                    b bVar8 = aVar.f14823e;
                    bVar8.f14868o = i12;
                    bVar8.f14870p = -1;
                    bVar8.f14872q = -1;
                    bVar8.f14873r = -1;
                    bVar8.f14874s = -1;
                } else {
                    String D4 = D(i13);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(D4).length() + 19);
                    sb5.append("right to ");
                    sb5.append(D4);
                    sb5.append(" undefined");
                    throw new IllegalArgumentException(sb5.toString());
                }
                aVar.f14823e.J = i14;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f14823e;
                    bVar9.f14872q = i12;
                    bVar9.f14870p = -1;
                    bVar9.f14868o = -1;
                    bVar9.f14864m = -1;
                    bVar9.f14866n = -1;
                    return;
                } else if (i13 == 3) {
                    b bVar10 = aVar.f14823e;
                    bVar10.f14873r = i12;
                    bVar10.f14870p = -1;
                    bVar10.f14868o = -1;
                    bVar10.f14864m = -1;
                    bVar10.f14866n = -1;
                    return;
                } else if (i13 == 4) {
                    b bVar11 = aVar.f14823e;
                    bVar11.f14874s = i12;
                    bVar11.f14870p = -1;
                    bVar11.f14868o = -1;
                    bVar11.f14864m = -1;
                    bVar11.f14866n = -1;
                    return;
                } else {
                    String D5 = D(i13);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(D5).length() + 19);
                    sb6.append("right to ");
                    sb6.append(D5);
                    sb6.append(" undefined");
                    throw new IllegalArgumentException(sb6.toString());
                }
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f14823e;
                    bVar12.f14876u = i12;
                    bVar12.f14875t = -1;
                } else if (i13 == 7) {
                    b bVar13 = aVar.f14823e;
                    bVar13.f14875t = i12;
                    bVar13.f14876u = -1;
                } else {
                    String D6 = D(i13);
                    StringBuilder sb7 = new StringBuilder(String.valueOf(D6).length() + 19);
                    sb7.append("right to ");
                    sb7.append(D6);
                    sb7.append(" undefined");
                    throw new IllegalArgumentException(sb7.toString());
                }
                aVar.f14823e.L = i14;
                return;
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f14823e;
                    bVar14.f14878w = i12;
                    bVar14.f14877v = -1;
                } else if (i13 == 6) {
                    b bVar15 = aVar.f14823e;
                    bVar15.f14877v = i12;
                    bVar15.f14878w = -1;
                } else {
                    String D7 = D(i13);
                    StringBuilder sb8 = new StringBuilder(String.valueOf(D7).length() + 19);
                    sb8.append("right to ");
                    sb8.append(D7);
                    sb8.append(" undefined");
                    throw new IllegalArgumentException(sb8.toString());
                }
                aVar.f14823e.K = i14;
                return;
            default:
                String D8 = D(i11);
                String D9 = D(i13);
                StringBuilder sb9 = new StringBuilder(String.valueOf(D8).length() + 12 + String.valueOf(D9).length());
                sb9.append(D8);
                sb9.append(" to ");
                sb9.append(D9);
                sb9.append(" unknown");
                throw new IllegalArgumentException(sb9.toString());
        }
    }

    public void k(int i10, int i11, int i12, float f10) {
        b bVar = r(i10).f14823e;
        bVar.A = i11;
        bVar.B = i12;
        bVar.C = f10;
    }

    public void l(int i10, int i11) {
        r(i10).f14823e.f14848e = i11;
    }

    public void m(int i10, int i11) {
        r(i10).f14823e.f14846d = i11;
    }

    public final int[] n(View view, String str) {
        int i10;
        Object h10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = x2.c.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, TtmlNode.ATTR_ID, context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (h10 = ((ConstraintLayout) view.getParent()).h(0, trim)) != null && (h10 instanceof Integer)) {
                i10 = ((Integer) h10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    public final void o(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14, int i15, int i16) {
        if (iArr.length >= 2) {
            if (fArr != null && fArr.length != iArr.length) {
                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
            }
            if (fArr != null) {
                r(iArr[0]).f14823e.V = fArr[0];
            }
            r(iArr[0]).f14823e.W = i14;
            j(iArr[0], i15, i10, i11, -1);
            for (int i17 = 1; i17 < iArr.length; i17++) {
                int i18 = iArr[i17];
                int i19 = i17 - 1;
                j(iArr[i17], i15, iArr[i19], i16, -1);
                j(iArr[i19], i16, iArr[i17], i15, -1);
                if (fArr != null) {
                    r(iArr[i17]).f14823e.V = fArr[i17];
                }
            }
            j(iArr[iArr.length - 1], i16, i12, i13, -1);
            return;
        }
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }

    public void p(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        o(i10, i11, i12, i13, iArr, fArr, i14, 6, 7);
    }

    public final a q(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? x2.d.J2 : x2.d.f59592t);
        y(context, aVar, obtainStyledAttributes, z10);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public final a r(int i10) {
        if (!this.f14818e.containsKey(Integer.valueOf(i10))) {
            this.f14818e.put(Integer.valueOf(i10), new a());
        }
        return this.f14818e.get(Integer.valueOf(i10));
    }

    public void s(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a q10 = q(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        q10.f14823e.f14840a = true;
                    }
                    this.f14818e.put(Integer.valueOf(q10.f14819a), q10);
                    continue;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cd, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.t(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void y(Context context, a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            z(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != x2.d.f59610v && x2.d.N != index && x2.d.O != index) {
                aVar.f14822d.f14883a = true;
                aVar.f14823e.f14842b = true;
                aVar.f14821c.f14897a = true;
                aVar.f14824f.f14903a = true;
            }
            switch (f14812g.get(index)) {
                case 1:
                    b bVar = aVar.f14823e;
                    bVar.f14872q = u(typedArray, index, bVar.f14872q);
                    break;
                case 2:
                    b bVar2 = aVar.f14823e;
                    bVar2.J = typedArray.getDimensionPixelSize(index, bVar2.J);
                    break;
                case 3:
                    b bVar3 = aVar.f14823e;
                    bVar3.f14870p = u(typedArray, index, bVar3.f14870p);
                    break;
                case 4:
                    b bVar4 = aVar.f14823e;
                    bVar4.f14868o = u(typedArray, index, bVar4.f14868o);
                    break;
                case 5:
                    aVar.f14823e.f14881z = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f14823e;
                    bVar5.D = typedArray.getDimensionPixelOffset(index, bVar5.D);
                    break;
                case 7:
                    b bVar6 = aVar.f14823e;
                    bVar6.E = typedArray.getDimensionPixelOffset(index, bVar6.E);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar7 = aVar.f14823e;
                        bVar7.K = typedArray.getDimensionPixelSize(index, bVar7.K);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    b bVar8 = aVar.f14823e;
                    bVar8.f14878w = u(typedArray, index, bVar8.f14878w);
                    break;
                case 10:
                    b bVar9 = aVar.f14823e;
                    bVar9.f14877v = u(typedArray, index, bVar9.f14877v);
                    break;
                case 11:
                    b bVar10 = aVar.f14823e;
                    bVar10.Q = typedArray.getDimensionPixelSize(index, bVar10.Q);
                    break;
                case 12:
                    b bVar11 = aVar.f14823e;
                    bVar11.R = typedArray.getDimensionPixelSize(index, bVar11.R);
                    break;
                case 13:
                    b bVar12 = aVar.f14823e;
                    bVar12.N = typedArray.getDimensionPixelSize(index, bVar12.N);
                    break;
                case 14:
                    b bVar13 = aVar.f14823e;
                    bVar13.P = typedArray.getDimensionPixelSize(index, bVar13.P);
                    break;
                case 15:
                    b bVar14 = aVar.f14823e;
                    bVar14.S = typedArray.getDimensionPixelSize(index, bVar14.S);
                    break;
                case 16:
                    b bVar15 = aVar.f14823e;
                    bVar15.O = typedArray.getDimensionPixelSize(index, bVar15.O);
                    break;
                case 17:
                    b bVar16 = aVar.f14823e;
                    bVar16.f14850f = typedArray.getDimensionPixelOffset(index, bVar16.f14850f);
                    break;
                case 18:
                    b bVar17 = aVar.f14823e;
                    bVar17.f14852g = typedArray.getDimensionPixelOffset(index, bVar17.f14852g);
                    break;
                case 19:
                    b bVar18 = aVar.f14823e;
                    bVar18.f14854h = typedArray.getFloat(index, bVar18.f14854h);
                    break;
                case 20:
                    b bVar19 = aVar.f14823e;
                    bVar19.f14879x = typedArray.getFloat(index, bVar19.f14879x);
                    break;
                case 21:
                    b bVar20 = aVar.f14823e;
                    bVar20.f14848e = typedArray.getLayoutDimension(index, bVar20.f14848e);
                    break;
                case 22:
                    d dVar = aVar.f14821c;
                    dVar.f14898b = typedArray.getInt(index, dVar.f14898b);
                    d dVar2 = aVar.f14821c;
                    dVar2.f14898b = f14811f[dVar2.f14898b];
                    break;
                case 23:
                    b bVar21 = aVar.f14823e;
                    bVar21.f14846d = typedArray.getLayoutDimension(index, bVar21.f14846d);
                    break;
                case 24:
                    b bVar22 = aVar.f14823e;
                    bVar22.G = typedArray.getDimensionPixelSize(index, bVar22.G);
                    break;
                case 25:
                    b bVar23 = aVar.f14823e;
                    bVar23.f14856i = u(typedArray, index, bVar23.f14856i);
                    break;
                case 26:
                    b bVar24 = aVar.f14823e;
                    bVar24.f14858j = u(typedArray, index, bVar24.f14858j);
                    break;
                case 27:
                    b bVar25 = aVar.f14823e;
                    bVar25.F = typedArray.getInt(index, bVar25.F);
                    break;
                case 28:
                    b bVar26 = aVar.f14823e;
                    bVar26.H = typedArray.getDimensionPixelSize(index, bVar26.H);
                    break;
                case 29:
                    b bVar27 = aVar.f14823e;
                    bVar27.f14860k = u(typedArray, index, bVar27.f14860k);
                    break;
                case 30:
                    b bVar28 = aVar.f14823e;
                    bVar28.f14862l = u(typedArray, index, bVar28.f14862l);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar29 = aVar.f14823e;
                        bVar29.L = typedArray.getDimensionPixelSize(index, bVar29.L);
                        break;
                    } else {
                        break;
                    }
                case 32:
                    b bVar30 = aVar.f14823e;
                    bVar30.f14875t = u(typedArray, index, bVar30.f14875t);
                    break;
                case 33:
                    b bVar31 = aVar.f14823e;
                    bVar31.f14876u = u(typedArray, index, bVar31.f14876u);
                    break;
                case 34:
                    b bVar32 = aVar.f14823e;
                    bVar32.I = typedArray.getDimensionPixelSize(index, bVar32.I);
                    break;
                case 35:
                    b bVar33 = aVar.f14823e;
                    bVar33.f14866n = u(typedArray, index, bVar33.f14866n);
                    break;
                case 36:
                    b bVar34 = aVar.f14823e;
                    bVar34.f14864m = u(typedArray, index, bVar34.f14864m);
                    break;
                case 37:
                    b bVar35 = aVar.f14823e;
                    bVar35.f14880y = typedArray.getFloat(index, bVar35.f14880y);
                    break;
                case 38:
                    aVar.f14819a = typedArray.getResourceId(index, aVar.f14819a);
                    break;
                case 39:
                    b bVar36 = aVar.f14823e;
                    bVar36.V = typedArray.getFloat(index, bVar36.V);
                    break;
                case 40:
                    b bVar37 = aVar.f14823e;
                    bVar37.U = typedArray.getFloat(index, bVar37.U);
                    break;
                case 41:
                    b bVar38 = aVar.f14823e;
                    bVar38.W = typedArray.getInt(index, bVar38.W);
                    break;
                case 42:
                    b bVar39 = aVar.f14823e;
                    bVar39.X = typedArray.getInt(index, bVar39.X);
                    break;
                case 43:
                    d dVar3 = aVar.f14821c;
                    dVar3.f14900d = typedArray.getFloat(index, dVar3.f14900d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar = aVar.f14824f;
                        eVar.f14915m = true;
                        eVar.f14916n = typedArray.getDimension(index, eVar.f14916n);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    e eVar2 = aVar.f14824f;
                    eVar2.f14905c = typedArray.getFloat(index, eVar2.f14905c);
                    break;
                case 46:
                    e eVar3 = aVar.f14824f;
                    eVar3.f14906d = typedArray.getFloat(index, eVar3.f14906d);
                    break;
                case 47:
                    e eVar4 = aVar.f14824f;
                    eVar4.f14907e = typedArray.getFloat(index, eVar4.f14907e);
                    break;
                case 48:
                    e eVar5 = aVar.f14824f;
                    eVar5.f14908f = typedArray.getFloat(index, eVar5.f14908f);
                    break;
                case 49:
                    e eVar6 = aVar.f14824f;
                    eVar6.f14909g = typedArray.getDimension(index, eVar6.f14909g);
                    break;
                case 50:
                    e eVar7 = aVar.f14824f;
                    eVar7.f14910h = typedArray.getDimension(index, eVar7.f14910h);
                    break;
                case 51:
                    e eVar8 = aVar.f14824f;
                    eVar8.f14912j = typedArray.getDimension(index, eVar8.f14912j);
                    break;
                case 52:
                    e eVar9 = aVar.f14824f;
                    eVar9.f14913k = typedArray.getDimension(index, eVar9.f14913k);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar10 = aVar.f14824f;
                        eVar10.f14914l = typedArray.getDimension(index, eVar10.f14914l);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    b bVar40 = aVar.f14823e;
                    bVar40.Y = typedArray.getInt(index, bVar40.Y);
                    break;
                case 55:
                    b bVar41 = aVar.f14823e;
                    bVar41.Z = typedArray.getInt(index, bVar41.Z);
                    break;
                case 56:
                    b bVar42 = aVar.f14823e;
                    bVar42.f14841a0 = typedArray.getDimensionPixelSize(index, bVar42.f14841a0);
                    break;
                case 57:
                    b bVar43 = aVar.f14823e;
                    bVar43.f14843b0 = typedArray.getDimensionPixelSize(index, bVar43.f14843b0);
                    break;
                case 58:
                    b bVar44 = aVar.f14823e;
                    bVar44.f14845c0 = typedArray.getDimensionPixelSize(index, bVar44.f14845c0);
                    break;
                case 59:
                    b bVar45 = aVar.f14823e;
                    bVar45.f14847d0 = typedArray.getDimensionPixelSize(index, bVar45.f14847d0);
                    break;
                case 60:
                    e eVar11 = aVar.f14824f;
                    eVar11.f14904b = typedArray.getFloat(index, eVar11.f14904b);
                    break;
                case 61:
                    b bVar46 = aVar.f14823e;
                    bVar46.A = u(typedArray, index, bVar46.A);
                    break;
                case 62:
                    b bVar47 = aVar.f14823e;
                    bVar47.B = typedArray.getDimensionPixelSize(index, bVar47.B);
                    break;
                case 63:
                    b bVar48 = aVar.f14823e;
                    bVar48.C = typedArray.getFloat(index, bVar48.C);
                    break;
                case 64:
                    C0059c c0059c = aVar.f14822d;
                    c0059c.f14884b = u(typedArray, index, c0059c.f14884b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f14822d.f14886d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f14822d.f14886d = r2.b.f49709c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f14822d.f14888f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0059c c0059c2 = aVar.f14822d;
                    c0059c2.f14891i = typedArray.getFloat(index, c0059c2.f14891i);
                    break;
                case 68:
                    d dVar4 = aVar.f14821c;
                    dVar4.f14901e = typedArray.getFloat(index, dVar4.f14901e);
                    break;
                case 69:
                    aVar.f14823e.f14849e0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f14823e.f14851f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f14823e;
                    bVar49.f14853g0 = typedArray.getInt(index, bVar49.f14853g0);
                    break;
                case 73:
                    b bVar50 = aVar.f14823e;
                    bVar50.f14855h0 = typedArray.getDimensionPixelSize(index, bVar50.f14855h0);
                    break;
                case 74:
                    aVar.f14823e.f14861k0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f14823e;
                    bVar51.f14869o0 = typedArray.getBoolean(index, bVar51.f14869o0);
                    break;
                case 76:
                    C0059c c0059c3 = aVar.f14822d;
                    c0059c3.f14887e = typedArray.getInt(index, c0059c3.f14887e);
                    break;
                case 77:
                    aVar.f14823e.f14863l0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f14821c;
                    dVar5.f14899c = typedArray.getInt(index, dVar5.f14899c);
                    break;
                case 79:
                    C0059c c0059c4 = aVar.f14822d;
                    c0059c4.f14889g = typedArray.getFloat(index, c0059c4.f14889g);
                    break;
                case 80:
                    b bVar52 = aVar.f14823e;
                    bVar52.f14865m0 = typedArray.getBoolean(index, bVar52.f14865m0);
                    break;
                case 81:
                    b bVar53 = aVar.f14823e;
                    bVar53.f14867n0 = typedArray.getBoolean(index, bVar53.f14867n0);
                    break;
                case 82:
                    C0059c c0059c5 = aVar.f14822d;
                    c0059c5.f14885c = typedArray.getInteger(index, c0059c5.f14885c);
                    break;
                case 83:
                    e eVar12 = aVar.f14824f;
                    eVar12.f14911i = u(typedArray, index, eVar12.f14911i);
                    break;
                case 84:
                    C0059c c0059c6 = aVar.f14822d;
                    c0059c6.f14893k = typedArray.getInteger(index, c0059c6.f14893k);
                    break;
                case 85:
                    C0059c c0059c7 = aVar.f14822d;
                    c0059c7.f14892j = typedArray.getFloat(index, c0059c7.f14892j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f14822d.f14896n = typedArray.getResourceId(index, -1);
                        C0059c c0059c8 = aVar.f14822d;
                        if (c0059c8.f14896n != -1) {
                            c0059c8.f14895m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i11 == 3) {
                        aVar.f14822d.f14894l = typedArray.getString(index);
                        if (aVar.f14822d.f14894l.indexOf("/") > 0) {
                            aVar.f14822d.f14896n = typedArray.getResourceId(index, -1);
                            aVar.f14822d.f14895m = -2;
                            break;
                        } else {
                            aVar.f14822d.f14895m = -1;
                            break;
                        }
                    } else {
                        C0059c c0059c9 = aVar.f14822d;
                        c0059c9.f14895m = typedArray.getInteger(index, c0059c9.f14896n);
                        break;
                    }
                case 87:
                    String hexString = Integer.toHexString(index);
                    int i12 = f14812g.get(index);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 33);
                    sb2.append("unused attribute 0x");
                    sb2.append(hexString);
                    sb2.append("   ");
                    sb2.append(i12);
                    Log.w("ConstraintSet", sb2.toString());
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    String hexString2 = Integer.toHexString(index);
                    int i13 = f14812g.get(index);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(hexString2).length() + 34);
                    sb3.append("Unknown attribute 0x");
                    sb3.append(hexString2);
                    sb3.append("   ");
                    sb3.append(i13);
                    Log.w("ConstraintSet", sb3.toString());
                    break;
                case 91:
                    b bVar54 = aVar.f14823e;
                    bVar54.f14873r = u(typedArray, index, bVar54.f14873r);
                    break;
                case 92:
                    b bVar55 = aVar.f14823e;
                    bVar55.f14874s = u(typedArray, index, bVar55.f14874s);
                    break;
                case 93:
                    b bVar56 = aVar.f14823e;
                    bVar56.M = typedArray.getDimensionPixelSize(index, bVar56.M);
                    break;
                case 94:
                    b bVar57 = aVar.f14823e;
                    bVar57.T = typedArray.getDimensionPixelSize(index, bVar57.T);
                    break;
                case 95:
                    v(aVar.f14823e, typedArray, index, 0);
                    break;
                case 96:
                    v(aVar.f14823e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f14823e;
                    bVar58.f14871p0 = typedArray.getInt(index, bVar58.f14871p0);
                    break;
            }
        }
        b bVar59 = aVar.f14823e;
        if (bVar59.f14861k0 != null) {
            bVar59.f14859j0 = null;
        }
    }
}
