package com.skingz.designpattern.action.command;

public class CommandConcrete1 extends Command {
	Receiver receiver;
	//对哪个Receiver类进行命令处理
	public CommandConcrete1(Receiver _recevier){ this.receiver=_recevier; }
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.doSomething();
	}

}
