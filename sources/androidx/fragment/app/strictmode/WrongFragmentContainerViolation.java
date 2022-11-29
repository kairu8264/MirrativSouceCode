package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;

/* loaded from: classes.dex */
public final class WrongFragmentContainerViolation extends Violation {

    /* renamed from: x  reason: collision with root package name */
    public final ViewGroup f15387x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        p.h(fragment, "fragment");
        p.h(viewGroup, TtmlNode.RUBY_CONTAINER);
        this.f15387x = viewGroup;
    }
}
