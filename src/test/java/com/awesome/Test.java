package com.awesome;

import com.awesome.im.proto.AuthenticateRequestProto;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.UUID;

/**
 * projectName：im-protocol
 * className ：Test
 * class desc：TODO
 * createTime：2019/11/5 4:10 PM
 * creator：awesome
 */
public class Test {
    public static void main(String[] args) throws InvalidProtocolBufferException {

        AuthenticateRequestProto.AuthenticateRequest build = AuthenticateRequestProto.AuthenticateRequest.newBuilder().setTimestamp(System.currentTimeMillis())
                .setToken(UUID.randomUUID().toString()).build();
        byte[] bytes = build.toByteArray();


        AuthenticateRequestProto.AuthenticateRequest authenticateRequest = AuthenticateRequestProto.AuthenticateRequest.parseFrom(bytes);

        System.out.println(authenticateRequest);
    }
}
