<template>
	<view class="content">
		<view class="logo" v-if="true">
			<image :style='{"boxShadow":"","borderColor":"rgba(74, 209, 242, 1)","borderRadius":"40rpx","borderWidth":"2rpx","width":"160rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20201207/3879163aa3c7416b84df7dea4949bc01.png","isShow":true,"height":"160rpx"}' src='http://codegen.caihongy.cn/20201207/3879163aa3c7416b84df7dea4949bc01.png' mode="aspectFill"></image>
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.jiuzhenkahao" type="text" class="uni-input" name="" placeholder="就诊卡号" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xingming" type="text" class="uni-input" name="" placeholder="姓名" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
                        <picker @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
                                <view :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.shouji" type="text" class="uni-input" name="" placeholder="手机" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.shenfenzheng" type="text" class="uni-input" name="" placeholder="身份证" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.dizhi" type="text" class="uni-input" name="" placeholder="地址" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.gonghao" type="text" class="uni-input" name="" placeholder="工号" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.yishengxingming" type="text" class="uni-input" name="" placeholder="医生姓名" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
                        <picker @change="yishengxingbieChange" :value="yishengxingbieIndex" :range="yishengxingbieOptions">
                                <view :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.nianling" type="text" class="uni-input" name="" placeholder="年龄" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.zhiwei" type="text" class="uni-input" name="" placeholder="职位" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.keshi" type="text" class="uni-input" name="" placeholder="科室" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.lianxidianhua" type="text" class="uni-input" name="" placeholder="联系电话" />
		</view>
		<view>
			<button @tap="register" type="primary" :style='{"borderColor":"#ccc","backgroundColor":"rgba(48, 235, 157, 1)","borderRadius":"40rpx","color":"#333","borderWidth":"2rpx","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
                                yonghuxingbieOptions: [],
                                yonghuxingbieIndex: 0,
                                yishengxingbieOptions: [],
                                yishengxingbieIndex: 0,
				ruleForm: {
				},
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                        	this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='yisheng'){
                        	this.yishengxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yishengxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        yonghuxingbieChange(e) {
                                this.yonghuxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
                        },
                        // 下拉变化
                        yishengxingbieChange(e) {
                                this.yishengxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.yishengxingbieOptions[this.yishengxingbieIndex]
                        },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.jiuzhenkahao) && `yonghu` == this.tableName){
					this.$utils.msg(`就诊卡号不能为空`);
					return
				}
				if((!this.ruleForm.xingming) && `yonghu` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
					this.$utils.msg(`身份证应输入身份证格式`);
					return
				}
				if((!this.ruleForm.gonghao) && `yisheng` == this.tableName){
					this.$utils.msg(`工号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yisheng` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.yishengxingming) && `yisheng` == this.tableName){
					this.$utils.msg(`医生姓名不能为空`);
					return
				}
				if(`yisheng` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if(`yisheng` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入手机格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 100upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 88rpx;
}

</style>
