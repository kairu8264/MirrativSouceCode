package vi;

import android.app.Activity;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class g<TResult> {
    public g<TResult> a(Executor executor, b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public g<TResult> b(Executor executor, c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public g<TResult> c(c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract g<TResult> d(Activity activity, d dVar);

    public abstract g<TResult> e(Executor executor, d dVar);

    public abstract g<TResult> f(d dVar);

    public abstract g<TResult> g(Activity activity, e<? super TResult> eVar);

    public abstract g<TResult> h(Executor executor, e<? super TResult> eVar);

    public abstract g<TResult> i(e<? super TResult> eVar);

    public <TContinuationResult> g<TContinuationResult> j(Executor executor, a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> k(a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> l(Executor executor, a<TResult, g<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> m(a<TResult, g<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception n();

    public abstract TResult o();

    public abstract <X extends Throwable> TResult p(Class<X> cls) throws Throwable;

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s();

    public <TContinuationResult> g<TContinuationResult> t(Executor executor, f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> u(f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
