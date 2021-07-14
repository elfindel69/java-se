package com.hb.kart.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.hb.kart.pojos.Client;

public class ClientCollection implements Iterator<Client>, Iterable<Client>{
	private List<Client> clients = new ArrayList<Client>();
	private int offset = 0;

	@Override
	public Iterator<Client> iterator() {
		// TODO Auto-generated method stub
		offset = 0;
		return clients.iterator();
	}

	@Override
	public boolean hasNext() {
		return offset < clients.size();
	}

	@Override
	public Client next() {
		return clients.get(offset++);
	}
	
	public void add(Client c) {
		clients.add(c);
	}

	public int size() {
		return clients.size();
	}
	
	public Client get(int idx) {
		return clients.get(idx);
	}
}
