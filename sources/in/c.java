package in;

import com.twitter.sdk.android.core.TwitterApiException;
import com.twitter.sdk.android.core.TwitterException;

/* loaded from: classes4.dex */
public abstract class c<T> implements er.d<T> {
    @Override // er.d
    public final void a(er.b<T> bVar, Throwable th2) {
        c(new TwitterException("Request Failure", th2));
    }

    @Override // er.d
    public final void b(er.b<T> bVar, er.s<T> sVar) {
        if (sVar.f()) {
            d(new l<>(sVar.a(), sVar));
        } else {
            c(new TwitterApiException(sVar));
        }
    }

    public abstract void c(TwitterException twitterException);

    public abstract void d(l<T> lVar);
}
