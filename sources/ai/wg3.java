package ai;

import ai.wg3;
import ai.xg3;

/* loaded from: classes3.dex */
public abstract class wg3<MessageType extends xg3<MessageType, BuilderType>, BuilderType extends wg3<MessageType, BuilderType>> implements wj3 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.wj3
    public final /* bridge */ /* synthetic */ wj3 N0(xj3 xj3Var) {
        if (g().getClass().isInstance(xj3Var)) {
            return h((xg3) xj3Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract BuilderType h(MessageType messagetype);
}
