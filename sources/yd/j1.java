package yd;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.dena.mirrorman.customview.ShooterMatchingViewerPopUpView;

/* loaded from: classes2.dex */
public final class j1 extends ShapeDrawable.ShaderFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ShooterMatchingViewerPopUpView f61744a;

    public j1(ShooterMatchingViewerPopUpView shooterMatchingViewerPopUpView) {
        this.f61744a = shooterMatchingViewerPopUpView;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    /* renamed from: a */
    public LinearGradient resize(int i10, int i11) {
        return new LinearGradient(0.0f, 0.0f, i10, i11, c3.a.d(this.f61744a.getContext(), nd.w0.shooter_matching_invite_button_gradient_start), c3.a.d(this.f61744a.getContext(), nd.w0.shooter_matching_invite_button_gradient_end), Shader.TileMode.REPEAT);
    }
}
