package com.google.protobuf;

import com.google.protobuf.d0;

/* loaded from: classes4.dex */
public abstract class b<MessageType extends d0> implements fn.q<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    public static final l f28081a = l.b();

    public final MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.r()) {
            return messagetype;
        }
        throw d(messagetype).a().i(messagetype);
    }

    public final UninitializedMessageException d(MessageType messagetype) {
        if (messagetype instanceof a) {
            return ((a) messagetype).t();
        }
        return new UninitializedMessageException(messagetype);
    }

    @Override // fn.q
    /* renamed from: e */
    public MessageType a(f fVar, l lVar) throws InvalidProtocolBufferException {
        return c(f(fVar, lVar));
    }

    public MessageType f(f fVar, l lVar) throws InvalidProtocolBufferException {
        try {
            g u10 = fVar.u();
            MessageType messagetype = (MessageType) b(u10, lVar);
            try {
                u10.a(0);
                return messagetype;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.i(messagetype);
            }
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }
}
