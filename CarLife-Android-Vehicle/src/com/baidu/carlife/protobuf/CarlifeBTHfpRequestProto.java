// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.baidu.carlife.protobuf;

public final class CarlifeBTHfpRequestProto {
  private CarlifeBTHfpRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeBTHfpRequest extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeBTHfpRequest.newBuilder() to construct.
    private CarlifeBTHfpRequest() {}
    
    private static final CarlifeBTHfpRequest defaultInstance = new CarlifeBTHfpRequest();
    public static CarlifeBTHfpRequest getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeBTHfpRequest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpRequest_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpRequest_fieldAccessorTable;
    }
    
    // required int32 command = 1;
    public static final int COMMAND_FIELD_NUMBER = 1;
    private boolean hasCommand;
    private int command_ = 0;
    public boolean hasCommand() { return hasCommand; }
    public int getCommand() { return command_; }
    
    // optional string phoneNum = 2;
    public static final int PHONENUM_FIELD_NUMBER = 2;
    private boolean hasPhoneNum;
    private java.lang.String phoneNum_ = "";
    public boolean hasPhoneNum() { return hasPhoneNum; }
    public java.lang.String getPhoneNum() { return phoneNum_; }
    
    // optional int32 dtmfCode = 3;
    public static final int DTMFCODE_FIELD_NUMBER = 3;
    private boolean hasDtmfCode;
    private int dtmfCode_ = 0;
    public boolean hasDtmfCode() { return hasDtmfCode; }
    public int getDtmfCode() { return dtmfCode_; }
    
    public final boolean isInitialized() {
      if (!hasCommand) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasCommand()) {
        output.writeInt32(1, getCommand());
      }
      if (hasPhoneNum()) {
        output.writeString(2, getPhoneNum());
      }
      if (hasDtmfCode()) {
        output.writeInt32(3, getDtmfCode());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasCommand()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getCommand());
      }
      if (hasPhoneNum()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getPhoneNum());
      }
      if (hasDtmfCode()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, getDtmfCode());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest result;
      
      // Construct using com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest();
        return builder;
      }
      
      protected com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest.getDescriptor();
      }
      
      public com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest getDefaultInstanceForType() {
        return com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest) {
          return mergeFrom((com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest other) {
        if (other == com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest.getDefaultInstance()) return this;
        if (other.hasCommand()) {
          setCommand(other.getCommand());
        }
        if (other.hasPhoneNum()) {
          setPhoneNum(other.getPhoneNum());
        }
        if (other.hasDtmfCode()) {
          setDtmfCode(other.getDtmfCode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setCommand(input.readInt32());
              break;
            }
            case 18: {
              setPhoneNum(input.readString());
              break;
            }
            case 24: {
              setDtmfCode(input.readInt32());
              break;
            }
          }
        }
      }
      
      
      // required int32 command = 1;
      public boolean hasCommand() {
        return result.hasCommand();
      }
      public int getCommand() {
        return result.getCommand();
      }
      public Builder setCommand(int value) {
        result.hasCommand = true;
        result.command_ = value;
        return this;
      }
      public Builder clearCommand() {
        result.hasCommand = false;
        result.command_ = 0;
        return this;
      }
      
      // optional string phoneNum = 2;
      public boolean hasPhoneNum() {
        return result.hasPhoneNum();
      }
      public java.lang.String getPhoneNum() {
        return result.getPhoneNum();
      }
      public Builder setPhoneNum(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasPhoneNum = true;
        result.phoneNum_ = value;
        return this;
      }
      public Builder clearPhoneNum() {
        result.hasPhoneNum = false;
        result.phoneNum_ = getDefaultInstance().getPhoneNum();
        return this;
      }
      
      // optional int32 dtmfCode = 3;
      public boolean hasDtmfCode() {
        return result.hasDtmfCode();
      }
      public int getDtmfCode() {
        return result.getDtmfCode();
      }
      public Builder setDtmfCode(int value) {
        result.hasDtmfCode = true;
        result.dtmfCode_ = value;
        return this;
      }
      public Builder clearDtmfCode() {
        result.hasDtmfCode = false;
        result.dtmfCode_ = 0;
        return this;
      }
    }
    
    static {
      com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.getDescriptor();
    }
    
    static {
      com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.internalForceInit();
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpRequest_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036CarlifeBTHfpRequestProto.proto\022\032com.ba" +
      "idu.carlife.protobuf\"J\n\023CarlifeBTHfpRequ" +
      "est\022\017\n\007command\030\001 \002(\005\022\020\n\010phoneNum\030\002 \001(\t\022\020" +
      "\n\010dtmfCode\030\003 \001(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpRequest_descriptor,
              new java.lang.String[] { "Command", "PhoneNum", "DtmfCode", },
              com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest.class,
              com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequest.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
}
