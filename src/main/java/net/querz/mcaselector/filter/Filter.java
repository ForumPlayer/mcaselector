package net.querz.mcaselector.filter;

public abstract class Filter<T> {

	private FilterType type;
	private Operator operator;
	private Filter parent;

	public Filter(FilterType type) {
		this(type, Operator.AND);
	}

	public Filter(FilterType type, Operator operator) {
		this.type = type;
		this.operator = operator;
	}

	public Operator getOperator() {
		return operator;
	}

	public FilterType getType() {
		return type;
	}

	public void setParent(Filter parent) {
		this.parent = parent;
	}

	public Filter getParent() {
		return parent;
	}

	public abstract T getFilterValue();

	public abstract boolean setFilterValue(String raw);

	public abstract Comparator[] getComparators();

	public abstract Comparator getComparator();

	public abstract boolean matches(FilterData data);

	public abstract String toString(FilterData data);
}