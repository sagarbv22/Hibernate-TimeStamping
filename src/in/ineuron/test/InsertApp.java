package in.ineuron.test;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.BankAccount;
import in.ineuron.util.HibernateUtil;

public class InsertApp {

	public static void main(String[] args) {

		BankAccount account;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Long accNum = 0L;

		try {

			session = HibernateUtil.getSession();

			if (session != null) {

				transaction = session.beginTransaction();

				account = new BankAccount();
				account.setAccNo(7894561L);
				account.setAccHolderName("Sagar");
				account.setAccBranch("Biligere");
				account.setAccBal(4500.0f);
				account.setBankName("SBI");

				accNum = (Long) session.save(account);
				flag = true;

			}

		} catch (HibernateException e) {
			e.printStackTrace();
		}

		finally {
			if (flag) {
				transaction.commit();
				System.out.println("Registration SuccessFull ::" + accNum);
			} else {
				transaction.rollback();
				System.out.println("Failed");
			}
		}

	}

}
