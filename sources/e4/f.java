package e4;

import android.os.Build;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f30239a;

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f30240a;

        /* renamed from: b  reason: collision with root package name */
        public final d f30241b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f30242c = true;

        public a(TextView textView) {
            this.f30240a = textView;
            this.f30241b = new d(textView);
        }

        @Override // e4.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f30242c) {
                return h(inputFilterArr);
            }
            return f(inputFilterArr);
        }

        @Override // e4.f.b
        public boolean b() {
            return this.f30242c;
        }

        @Override // e4.f.b
        public void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // e4.f.b
        public void d(boolean z10) {
            this.f30242c = z10;
            l();
            k();
        }

        @Override // e4.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.f30242c) {
                return m(transformationMethod);
            }
            return j(transformationMethod);
        }

        public final InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f30241b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f30241b;
            return inputFilterArr2;
        }

        public final SparseArray<InputFilter> g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                if (inputFilterArr[i10] instanceof d) {
                    sparseArray.put(i10, inputFilterArr[i10]);
                }
            }
            return sparseArray;
        }

        public final InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> g10 = g(inputFilterArr);
            if (g10.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g10.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (g10.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        public void i(boolean z10) {
            this.f30242c = z10;
        }

        public final TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        public final void k() {
            this.f30240a.setFilters(a(this.f30240a.getFilters()));
        }

        public void l() {
            this.f30240a.setTransformationMethod(e(this.f30240a.getTransformationMethod()));
        }

        public final TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean b() {
            return false;
        }

        public void c(boolean z10) {
        }

        public void d(boolean z10) {
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f30243a;

        public c(TextView textView) {
            this.f30243a = new a(textView);
        }

        @Override // e4.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f30243a.a(inputFilterArr);
        }

        @Override // e4.f.b
        public boolean b() {
            return this.f30243a.b();
        }

        @Override // e4.f.b
        public void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f30243a.c(z10);
        }

        @Override // e4.f.b
        public void d(boolean z10) {
            if (f()) {
                this.f30243a.i(z10);
            } else {
                this.f30243a.d(z10);
            }
        }

        @Override // e4.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f30243a.e(transformationMethod);
        }

        public final boolean f() {
            return !androidx.emoji2.text.d.h();
        }
    }

    public f(TextView textView, boolean z10) {
        n3.h.h(textView, "textView cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f30239a = new b();
        } else if (!z10) {
            this.f30239a = new c(textView);
        } else {
            this.f30239a = new a(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f30239a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f30239a.b();
    }

    public void c(boolean z10) {
        this.f30239a.c(z10);
    }

    public void d(boolean z10) {
        this.f30239a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f30239a.e(transformationMethod);
    }
}
