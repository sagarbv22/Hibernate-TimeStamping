package in.ineuron.test;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.BankAccount;
import in.ineuron.util.HibernateUtil;

public class UpdateApp {

	public static void main(String[] args) {

		BankAccount account=null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Long accNum = 0L;

		try {

			session = HibernateUtil.getSession();

			if (session != null) {
				account = session.get(BankAccount.class, 7894561L);

				if (account != null) {
					transaction = session.beginTransaction();
					account.setAccBal(57000.0f);
					flag = true;
				} else {
					System.out.println("Record not found.");
				}
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		}

		finally {
			if (flag) {
				transaction.commit();
				System.out.println("Updated Successfully:-");
				System.out.println(account);
			} else {
				transaction.rollback();
				System.out.println("Failed");
			}
		}

	}

}
